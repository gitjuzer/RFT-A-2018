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
public class FXML7Controller implements Initializable {

    @FXML
    private AnchorPane rootPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void load_eighth(ActionEvent event) throws IOException {
        AnchorPane pane8 = FXMLLoader.load(getClass().getResource("8FXML.fxml"));
        rootPane.getChildren().setAll(pane8);
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
