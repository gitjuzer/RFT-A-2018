/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rft.játék.pkg2;

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
 * @author tamas
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
    private void loadNext(ActionEvent event) throws IOException {
        AnchorPane pane7 = FXMLLoader.load(getClass().getResource("FXML8.fxml"));
        
        rootPane.getChildren().setAll(pane7);
    }

    @FXML
    private void loadLast(ActionEvent event) throws IOException {
        AnchorPane pane7 = FXMLLoader.load(getClass().getResource("FXML10.fxml"));
        
        rootPane.getChildren().setAll(pane7);
    }

    @FXML
    private void wrong(ActionEvent event) throws IOException {
        FXMLLoader load = new FXMLLoader (getClass().getResource("Wrong.fxml"));
        Parent root1 = (Parent) load.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }
    
}
