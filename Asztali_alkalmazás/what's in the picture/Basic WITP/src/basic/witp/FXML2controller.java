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
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Tomcsa
 */
public class FXML2controller implements Initializable {

    @FXML
    private AnchorPane rootPane;
    @FXML
    private Button button;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void load_third(ActionEvent event) throws IOException {
        AnchorPane pane2 = FXMLLoader.load(getClass().getResource("3FXML.fxml"));
        rootPane.getChildren().setAll(pane2);
    }
    
}
