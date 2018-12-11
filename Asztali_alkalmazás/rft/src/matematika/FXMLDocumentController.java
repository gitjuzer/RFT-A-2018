/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematika;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Cica
 */
public class FXMLDocumentController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    public void changeScreenButtonPushed(ActionEvent event) throws IOException{
        Parent Question1Parent = FXMLLoader.load(getClass().getResource("Question1.fxml"));
        Scene Question1Scene = new Scene(Question1Parent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(Question1Scene);
        window.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
