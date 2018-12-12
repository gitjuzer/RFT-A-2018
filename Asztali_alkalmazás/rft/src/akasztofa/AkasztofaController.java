/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akasztofa;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Alex
 * wordLabel    (ez lesz a _ _ _ _ _)
 * kivalasztField  (textfield, amibe be lehet írni a betűt)
 * lifeLabel  (a maradék élet) - ki fogja írni, hogy hány db van még
 * letterLabel  (felhasznált betűk) - írogatja egymás után a betűket, amiket már beírtunk
 * valasztbtn a kiválasztáshoz - választ gomb, megnyomására update-el az élet és a felhasznált betű
 */
public class AkasztofaController implements Initializable {

    private Stage stage;
    @FXML
    private Button visszabtn;
    @FXML
    private TextField kivalasztField;
    @FXML
    private Label lifeLabel;
    @FXML
    private Label letterLabel1;
    @FXML
    private Label letterLabel2;
    @FXML
    private Label letterLabel3;
    @FXML
    private Label letterLabel4;
    @FXML
    private Label letterLabel5;
    @FXML
    private Label letterLabel6;
    @FXML
    private Label letterLabel7;
    @FXML
    private Label letterLabel8;
    @FXML
    private Label letterLabel9;
    @FXML
    private Label letterLabel10;
    @FXML
    private Label letterLabel11;
    @FXML
    private Label letterLabel12;
    @FXML
    private Label letterLabel13;
    @FXML
    private Label letterLabel14;
    @FXML
    private Label gameover;
    @FXML
    private Label wordLabel1;
    @FXML
    private Label wordLabel2;
    @FXML
    private Label wordLabel3;
    @FXML
    private Label wordLabel4;
    @FXML
    private Label wordLabel5;
    @FXML
    private Label wordLabel6;
    @FXML
    private Label wordLabel7;
    @FXML
    private Label wordLabel8;
    @FXML
    private Circle head;
    @FXML
    private Line body;
    @FXML
    private Line rightarm;
    @FXML
    private Line leftarm;
    @FXML
    private Line rightleg;
    @FXML
    private Line leftleg;
    
    /**
     * Initializes the controller class.
     */
    @FXML
    private void vissza(ActionEvent event) throws IOException{
        
        stage = (Stage) visszabtn.getScene().getWindow();
        AnchorPane root;
        root = (AnchorPane) FXMLLoader.load(getClass().getResource("/rft/easygameselectFXML.fxml"));
        Scene scene = new Scene(root);
       
        stage.setScene(scene);
    }
    List<String> words = Arrays.asList("baseball", "engineer", "computer", "marriage", "shoulder", "woodland");
    String word = words.get((int) (Math.random() * words.size()));
    int life = 6;
    Label[] letterLabel = new Label[14];
    Label[] wordLabel= new Label[8];
    Line[] drawing=new Line[5];
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lifeLabel.setText(Integer.toString(life));
        
        letterLabel[0]=letterLabel1;
        letterLabel[1]=letterLabel2;
        letterLabel[2]=letterLabel3;
        letterLabel[3]=letterLabel4;
        letterLabel[4]=letterLabel5;
        letterLabel[5]=letterLabel6;
        letterLabel[6]=letterLabel7;
        letterLabel[7]=letterLabel8;
        letterLabel[8]=letterLabel9;
        letterLabel[9]=letterLabel10;
        letterLabel[10]=letterLabel11;
        letterLabel[11]=letterLabel12;
        letterLabel[12]=letterLabel13;
        letterLabel[13]=letterLabel14;
        
        drawing[0]=body;
        drawing[1]=leftarm;
        drawing[2]=rightarm;
        drawing[3]=leftleg;
        drawing[4]=rightleg;
        
        wordLabel[0]=wordLabel1;
        wordLabel[1]=wordLabel2;
        wordLabel[2]=wordLabel3;
        wordLabel[3]=wordLabel4;
        wordLabel[4]=wordLabel5;
        wordLabel[5]=wordLabel6;
        wordLabel[6]=wordLabel7;
        wordLabel[7]=wordLabel8;
    }
 
    
       
    int count=0; 
    int draw=-1;
    int jelenlegi=0;
    @FXML
    private void valasztbtn(ActionEvent event) throws IOException{
        
        if(life>1){
            
            String valasztott=kivalasztField.getText();
            
            letterLabel[count].setText(valasztott);
            count++;
            
            if (word.contains(valasztott)){
                for (int i=0;i<word.length();i++){
                    char letter = word.charAt(i);
                    if (Character.toString(letter).equals(valasztott)){
                        wordLabel[i].setText(valasztott);
                    }
                }
                
            }
            else{
                life--;
                lifeLabel.setText(Integer.toString(life));
                if (draw==-1){
                    head.setVisible(true);
                    draw++;
                }
                else{
                drawing[draw].setVisible(true);
                draw++;               
                }
            }
            
        }
        else {
            gameover.setVisible(true);
            lifeLabel.setText("0");
            drawing[draw].setVisible(true);
        }    
    } 
        
}
