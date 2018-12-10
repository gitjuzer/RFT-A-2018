/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becleverapp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author LENOVOBOOK
 */
public class Question4Controller implements Initializable {

    public void wrongAnswerButtonPushed(ActionEvent event) throws IOException{
        Parent wrongAnswerParent = FXMLLoader.load(getClass().getResource("LosePage.fxml"));
        Scene LosePageScene = new Scene(wrongAnswerParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(LosePageScene);
        window.show();
    }
    public void goodAnswerButtonPushed(ActionEvent event) throws IOException{
        Parent Question5Parent = FXMLLoader.load(getClass().getResource("Question5.fxml"));
        Scene Question5Scene = new Scene(Question5Parent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(Question5Scene);
        window.show();
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
