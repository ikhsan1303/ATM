/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxatm1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Ikhsan
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private PasswordField PIN;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    String Pin = "2309";
    String pin = "";
    int kesempatan = 3;
    int tmp;
    @FXML
    private void satu(ActionEvent event) {
        pin += "1";
        PIN.setText(pin);
    }

    @FXML
    private void dua(ActionEvent event) {
        pin += "2";
        PIN.setText(pin);
    }

    @FXML
    private void tiga(ActionEvent event) {
        pin += "3";
        PIN.setText(pin);
    }

    @FXML
    private void empat(ActionEvent event) {
        pin += "4";
        PIN.setText(pin);
    }

    @FXML
    private void lima(ActionEvent event) {
        pin += "5";
        PIN.setText(pin);
    }

    @FXML
    private void enam(ActionEvent event) {
        pin += "6";
        PIN.setText(pin);
    }

    @FXML
    private void tujuh(ActionEvent event) {
        pin += "7";
        PIN.setText(pin);
    }

    @FXML
    private void delapan(ActionEvent event) {
        pin += "8";
        PIN.setText(pin);
    }

    @FXML
    private void sembilan(ActionEvent event) {
        pin += "9";
        PIN.setText(pin);
    }

    @FXML
    private void hapus(ActionEvent event) {
        pin = "";
        PIN.setText(pin);
    }

    @FXML
    private void sepuluh(ActionEvent event) {
        pin += "0";
        PIN.setText(pin);
    }

    @FXML
    private void proses(ActionEvent event) {
        if (pin.equals(Pin)){
        try {
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLHome.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("ATM");
            stage.show();
            
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
        }
        }else{
            kesempatan -= 1;
            JOptionPane.showMessageDialog(null, "PIN SALAH\nKesempatan Tinggal"+kesempatan+"kali");
            PIN.setText("");
            pin = "";
            if (kesempatan == 0){
                System.exit(0);
            }
        }
    }
    
}
