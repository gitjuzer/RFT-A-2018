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
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Tomcsa
 */
public class FXML6Controller implements Initializable {

    @FXML
    private AnchorPane rootPane;

    /**
     * Initializes the controller class.
     * @param url
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void load_seventh(ActionEvent event) throws IOException {
        AnchorPane pane7 = FXMLLoader.load(getClass().getResource("7FXML.fxml"));
        rootPane.getChildren().setAll(pane7);
    }
    @FXML
    private void wrong_answer(ActionEvent event) throws IOException {
        FXMLLoader load = new FXMLLoader (getClass().getResource("Wrong_answer.fxml"));
        Parent root1 = (Parent) load.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }
}
