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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Cica
 */
public class FXML2Controller implements Initializable {

   @FXML
    private AnchorPane rootPane;
    @FXML
    private Button button;
     @FXML
    private AnchorPane button_wrong;
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void load_third(ActionEvent event) throws IOException {
        AnchorPane pane3 = FXMLLoader.load(getClass().getResource("FXML3.fxml"));
        rootPane.getChildren().setAll(pane3);
        
    }
    @FXML
    private void wrong_answer2(ActionEvent event) throws IOException {
        FXMLLoader load = new FXMLLoader (getClass().getResource("Wrong_answer.fxml"));
        Parent root1 = (Parent) load.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    } 
    
}
