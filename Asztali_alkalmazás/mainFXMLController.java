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
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Alex
 */
public class mainFXMLController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void ToSelectEasy(ActionEvent event) throws IOException{
        
        Stage mainStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("easygameselectFXML.fxml"));
        Scene scene = new Scene(root);
        mainStage.setScene(scene);
                 
        mainStage.show();
    }
    @FXML
    private void ToSelectDifficult(ActionEvent event) throws IOException{
        
        Stage mainStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("difficultgameselectFXML.fxml"));
        Scene scene = new Scene(root);
        mainStage.setScene(scene);
                 
        mainStage.show();
    }
    @FXML
    private void ToSzintfelmero(ActionEvent event) throws IOException{
        
        Stage mainStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("szintfelmeroFXML.fxml"));
        Scene scene = new Scene(root);
        mainStage.setScene(scene);
                 
        mainStage.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
