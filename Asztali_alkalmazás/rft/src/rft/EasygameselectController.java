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
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;



public class EasygameselectController implements Initializable {

    private Stage stage;
    @FXML
    Button visszabtn;
    /**
     * Initializes the controller class.
     */
    @FXML
    private void vissza(ActionEvent event) throws IOException{
        
        stage = (Stage) visszabtn.getScene().getWindow();
        AnchorPane root;
        root = (AnchorPane) FXMLLoader.load(getClass().getResource("mainFXML.fxml"));
        Scene scene = new Scene(root);
       
        stage.setScene(scene);
    }
    @FXML
    Button akasztofabtn;
    /**
     * Initializes the controller class.
     */
    @FXML
    private void ToAkasztofa(ActionEvent event) throws IOException{
        
        stage = (Stage) akasztofabtn.getScene().getWindow();
        AnchorPane root;
        root = (AnchorPane) FXMLLoader.load(getClass().getResource("/akasztofa/akasztofaFXML.fxml"));
        Scene scene = new Scene(root);
       
        stage.setScene(scene);
    }
    @FXML
    private void Tomivanakepen(ActionEvent event) throws IOException{
        
        stage = (Stage) akasztofabtn.getScene().getWindow();
        AnchorPane root;
        root = (AnchorPane) FXMLLoader.load(getClass().getResource("/mivanakepen/FXMLStart.fxml"));
        Scene scene = new Scene(root);
       
        stage.setScene(scene);
    }
     @FXML
    Button akasztofabtn2;
    
    @FXML
    private void ToQuiz(ActionEvent event) throws IOException{
        
        stage = (Stage) akasztofabtn2.getScene().getWindow();
        AnchorPane root;
        root = (AnchorPane) FXMLLoader.load(getClass().getResource("/quiz/FXMLDocument.fxml"));
        Scene scene = new Scene(root);
       
        stage.setScene(scene);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
