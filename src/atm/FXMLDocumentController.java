/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author Rara ^___^
 */
public class FXMLDocumentController implements Initializable {
    
    String Pin="";
    String PIN="1234";
    int kesempatan=3;
    int tmp;
    
    @FXML
    private Label label;
    
    @FXML
    private JFXPasswordField pin;

    @FXML
    private JFXButton btn1;

    @FXML
    private JFXButton btn2;

    @FXML
    private JFXButton btn3;

    @FXML
    private JFXButton btn4;

    @FXML
    private JFXButton btn5;

    @FXML
    private JFXButton btn6;

    @FXML
    private JFXButton btn7;

    @FXML
    private JFXButton btn8;

    @FXML
    private JFXButton btn9;

    @FXML
    private JFXButton btnc;

    @FXML
    private JFXButton btn0;

    @FXML
    private JFXButton btnoke;

    @FXML
    void tekan0(ActionEvent event) {
        Pin +="0";
        pin.setText(Pin);
    }

    @FXML
    void tekan1(ActionEvent event) {
        Pin +="1";
        pin.setText(Pin);
    }

    @FXML
    void tekan2(ActionEvent event) {
        Pin +="2";
        pin.setText(Pin);
    }

    @FXML
    void tekan3(ActionEvent event) {
        Pin +="3";
        pin.setText(Pin);
    }

    @FXML
    void tekan4(ActionEvent event) {
        Pin +="4";
        pin.setText(Pin);
    }

    @FXML
    void tekan5(ActionEvent event) {
        Pin +="5";
        pin.setText(Pin);
    }

    @FXML
    void tekan6(ActionEvent event) {
        Pin +="6";
        pin.setText(Pin);
    }

    @FXML
    void tekan7(ActionEvent event) {
        Pin +="7";
        pin.setText(Pin);
    }

    @FXML
    void tekan8(ActionEvent event) {
        Pin +="8";
        pin.setText(Pin);
    }

    @FXML
    void tekan9(ActionEvent event) {
        Pin +="9";
        pin.setText(Pin);
    }

    @FXML
    void tekanc(ActionEvent event) {
        Pin +="";
        pin.setText(Pin);
    }

    @FXML
    void tekanok(ActionEvent event) {
        if(Pin.equals(PIN)){
            try {
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXML.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 830, 450);
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Login");
            stage.show();
            
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
        }
        }
        else{
            kesempatan -= 1;
            JOptionPane.showMessageDialog(null, "PIN Salah \nTersisa "+kesempatan+" kesempatan lagi");
            pin.setText("");
            Pin="";
            if(kesempatan==0){
                System.exit(0);
            }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
