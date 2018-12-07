/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mivanakepen;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Cica
 */
public class FXML3Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    private Stage stage;
    @FXML
    Button button;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void vissza(ActionEvent event) throws IOException {
        stage = (Stage) button.getScene().getWindow();
        AnchorPane root;
        root = (AnchorPane) FXMLLoader.load(getClass().getResource("/rft/mainFXML.fxml"));
        Scene scene = new Scene(root);
       
        stage.setScene(scene);
        
    }
}
