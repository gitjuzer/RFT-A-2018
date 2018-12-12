/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rft;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Cica
 */
public class SzintfelmeroeredmenyController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
            indul();
        } catch (IOException ex) {
            Logger.getLogger(SzintfelmeroeredmenyController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }    
    @FXML
    private Stage stage;
    @FXML
    Button button;
    @FXML
    Label helyes;
    @FXML
    Label szint;
    
    @FXML
    private void indul() throws IOException {
    
       
        
    if(SzintfelmeroController.helyesvalaszokszama>=3)
    {
    helyes.setText("Az eredményed: "+SzintfelmeroController.helyesvalaszokszama+"/5 helyes válasz!");
    szint.setText("A szinted: Haladó");
    
    }
    else
    {
    helyes.setText("Az eredményed: "+SzintfelmeroController.helyesvalaszokszama+"/5 helyes válasz!");
    szint.setText("A szinted: Kezdő");
    
    
    
    }
    
    }
        
    @FXML
    private void exit() throws IOException {

    if(SzintfelmeroController.helyesvalaszokszama>=3){
    stage = (Stage) button.getScene().getWindow();
   
    AnchorPane root;
    root = (AnchorPane) FXMLLoader.load(getClass().getResource("difficultgameselectFXML.fxml"));
    Scene scene = new Scene(root);
       
        stage.setScene(scene);
    
        }
    else{
    stage = (Stage) button.getScene().getWindow();
     
    AnchorPane root;
    root = (AnchorPane) FXMLLoader.load(getClass().getResource("easygameselectFXML.fxml"));
    Scene scene = new Scene(root);
       
    stage.setScene(scene);
    }
    SzintfelmeroController.helyesvalaszokszama=0;
    }
    } 
    


