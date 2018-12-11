/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

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
public class FXML5Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    private Stage stage;
    @FXML
    Button button;
    @FXML
    Button button1;
    
    @FXML
    private void loadNext(ActionEvent event) throws IOException {
        stage = (Stage) button.getScene().getWindow();
        AnchorPane root;
        root = (AnchorPane) FXMLLoader.load(getClass().getResource("FXML6.fxml"));
        Scene scene = new Scene(root);
       
        stage.setScene(scene);
    }

    @FXML
    private void loadLast(ActionEvent event) throws IOException {
        stage = (Stage) button1.getScene().getWindow();
        AnchorPane root;
        root = (AnchorPane) FXMLLoader.load(getClass().getResource("FXML10.fxml"));
        Scene scene = new Scene(root);
       
        stage.setScene(scene);
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
