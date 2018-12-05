/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.witp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Tomcsa
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private AnchorPane rootPane;
    @FXML
    private Button button;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadSecond(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("2FXML.fxml"));
        rootPane.getChildren().setAll(pane);
                
    }
    
}
