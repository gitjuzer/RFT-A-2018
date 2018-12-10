/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rft;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author Alex
 */
public class SzintfelmeroController implements Initializable {
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
    Button ellenorzobtn;
    
    @FXML
    private void ellenorzes(ActionEvent event) throws IOException {
        
        if(firstwordlabel.getText().equals(valasz.get(index.get(0)))) helyesvalaszokszama++;
        if(secondwordlabel.getText().equals(valasz.get(index.get(1)))) helyesvalaszokszama++;
        if(thirdwordlabel.getText().equals(valasz.get(index.get(2)))) helyesvalaszokszama++;
        if(forthwordlabel.getText().equals(valasz.get(index.get(3)))) helyesvalaszokszama++;
        if(fifthwordlabel.getText().equals(valasz.get(index.get(4)))) helyesvalaszokszama++;
        
   
        stage = (Stage) ellenorzobtn.getScene().getWindow();
   
        AnchorPane root;
        root = (AnchorPane) FXMLLoader.load(getClass().getResource("szintfelmeroeredmeny.fxml"));
        Scene scene = new Scene(root);
       
        stage.setScene(scene);
        
    } 
   
    @FXML
    Label label1;
    @FXML    
    Label label2;
    @FXML
    Label label3;
    @FXML
    Label label4;
    @FXML
    Label label5;
    @FXML
    TextField firstwordlabel;
    @FXML
    TextField secondwordlabel;
    @FXML
    TextField thirdwordlabel;
    @FXML
    TextField forthwordlabel;
    @FXML
    TextField fifthwordlabel;
    
    protected static int helyesvalaszokszama=0;
    
    protected static ArrayList<String> valasz = new ArrayList<String>();
        
    protected static ArrayList<Integer> index = new ArrayList<Integer>();
    
    protected static ArrayList<String> kerdesek = new ArrayList<String>();
    
    @FXML
    private void szintfelmeres(){
        Random rnd = new Random();
        
        
        int i=0;
        
        while(i < 5){
             
            int random = rnd.nextInt(9);
            if(!index.contains(random)) 
            {
            index.add(random);
            i++;
            }
            
        }
        label1.setText(kerdesek.get(index.get(0)));
        label2.setText(kerdesek.get(index.get(1)));
        label3.setText(kerdesek.get(index.get(2)));
        label4.setText(kerdesek.get(index.get(3)));
        label5.setText(kerdesek.get(index.get(4)));
        i=0;
    }
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Collections.addAll(kerdesek,"macska","kutya","eszik","iszik","alszik","unalmas","piros","zöld","hétfő","barátok");
        Collections.addAll(valasz,"cat","dog","eat","drink","sleep","boring","red","green","monday","friends");
        szintfelmeres();
        
    }    
    
}
