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
public class FXMLStartController implements Initializable {

    @FXML
    private AnchorPane rootPane;
    
    private Stage stage;
    @FXML
    Button visszagomb;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Start_Game(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("FXML1.fxml"));
        rootPane.getChildren().setAll(pane);
        
    } 
    @FXML
    private void vissza(ActionEvent event) throws IOException {
        stage = (Stage) visszagomb.getScene().getWindow();
        AnchorPane root;
        root = (AnchorPane) FXMLLoader.load(getClass().getResource("/rft/mainFXML.fxml"));
        Scene scene = new Scene(root);
       
        stage.setScene(scene);
        
    } 
}
