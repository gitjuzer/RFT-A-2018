/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rft;

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
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class mainFXMLController implements Initializable {
    
    @FXML
    private Label label;
    private Stage stage;
    @FXML
    Button konnyubtn;
    @FXML
    Button nehezbtn;
    @FXML
    Button szintfelmerobtn;
    
    @FXML
    private void ToSelectEasy(ActionEvent event) throws IOException{
        
       /* Stage mainStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("easygameselectFXML.fxml"));
        Scene scene = new Scene(root);
        mainStage.setScene(scene);
                 
        mainStage.show();
*/
       
        stage = (Stage) konnyubtn.getScene().getWindow();
        AnchorPane root;
        root = (AnchorPane) FXMLLoader.load(getClass().getResource("easygameselectFXML.fxml"));
        Scene scene = new Scene(root);
       
        stage.setScene(scene);
    }
    @FXML
    private void ToSelectDifficult(ActionEvent event) throws IOException{
        
        
        
        stage = (Stage) nehezbtn.getScene().getWindow();
        AnchorPane root;
        root = (AnchorPane) FXMLLoader.load(getClass().getResource("difficultgameselectFXML.fxml"));
        Scene scene = new Scene(root);
       
        stage.setScene(scene);
    }
    @FXML
    private void ToSzintfelmero(ActionEvent event) throws IOException{
        
        SzintfelmeroController.index.clear();
        SzintfelmeroController.kerdesek.clear();
        SzintfelmeroController.valasz.clear();
        
        stage = (Stage) szintfelmerobtn.getScene().getWindow();
        AnchorPane root;
        root = (AnchorPane) FXMLLoader.load(getClass().getResource("szintfelmeroFXML.fxml"));
        Scene scene = new Scene(root);
       
        stage.setScene(scene);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
