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
    @FXML
    private void valasztbtn(ActionEvent event) throws IOException{
        
        //while(Integer.parseInt((String)lifeLabel.toString())>0){
        if(life>0){
            
            String valasztott=kivalasztField.getText();
            
            letterLabel[count].setText(valasztott);
            count++;
            
            if (word.contains(valasztott)){
                for (int i=0;i<word.length();i++){
                    char letter = word.charAt(i);
                    if (Character.toString(letter)==valasztott){
                        wordLabel[i].setText(valasztott);
                    }
                }
                
            }
            else{
                life--;
                lifeLabel.setText(Integer.toString(life));
                
            }
            
            
            
            
            
            
            
            
            
            
            /*if(l.contains(kivalasztField)){
                System.out.println("Ezt a betűt már egyszer beírtad!"); //letterLabel bővül a beírt betűvel
                continue;
            }*/
            
            //letterLabel.add(kivalasztott);
            //letterLabel.setText("" + kivalasztField);
            
            /*if(word.contains(kivalasztott+"")){
                for(int y=0; y<word.length(); y++){
                    if(word.charAt(y)==kivalasztott){
                        hossz[y]=kivalasztott;
                    }
                }
            }
            else{
                 life--;
            }
            
            if(word.equals(String.valueOf(hossz))){
                wordLabel.setText(String.valueOf(hossz));
                wordLabel.setText("Ügyes vagy, nyertél!" + String.valueOf(hossz));
                //System.out.println("Ügyes vagy, nyertél!");
                break;
            }
            wordLabel.setText(String.valueOf(hossz));
            lifeLabel.setText(Integer.toString(life));
            //System.out.print(wordLabel);
            //System.out.print(lifeLabel);
            
            letterLabel[b].setText(String.valueOf(kivalasztott));
            b++;
            
        }
        
        
        if(life==0){
            wordLabel.setText("Sajnos vesztettél, majd legközelebb!" + String.valueOf(hossz));
            //System.out.println("Sajnos vesztettél, majd legközelebb!");
        } /*
    }
   /* @FXML
    private void valasztbtn(ActionEvent event) throws IOException{
        
        List<String> words = Arrays.asList("welcome", "banana", "computer", "cow", "rain", "water");
	String word = words.get((int) (Math.random() * words.size()));
        
        int life = 5;
        lifeLabel.setText(Integer.toString(life));
        
        char[] hossz = new char[word.length()];
        int i = 0;
        while(i < word.length()){
            hossz[i]='-';
            if(word.charAt(i) == ' '){
                hossz[i]= ' ';
            }
            i++;
        }
        wordLabel.setText(String.valueOf(hossz));
        lifeLabel.setText(Integer.toString(life));
        
        Scanner s = new Scanner(System.in); //to read character
        
        Label[] letterLabel = new Label[5];
        letterLabel[0]=letterLabel1;
        letterLabel[1]=letterLabel2;
        letterLabel[2]=letterLabel3;
        letterLabel[3]=letterLabel4;
        letterLabel[4]=letterLabel5;
        
        int b=0;
        //while(Integer.parseInt((String)lifeLabel.toString())>0){
        while(life>0){
            
            char kivalasztott = s.next(kivalasztField.getText()).charAt(0);
            
            /*if(l.contains(kivalasztField)){
                System.out.println("Ezt a betűt már egyszer beírtad!"); //letterLabel bővül a beírt betűvel
                continue;
            }
            
            //letterLabel.add(kivalasztott);
            //letterLabel.setText("" + kivalasztField);
            
            if(word.contains(kivalasztott+"")){
                for(int y=0; y<word.length(); y++){
                    if(word.charAt(y)==kivalasztott){
                        hossz[y]=kivalasztott;
                    }
                }
            }
            else{
                 life--;
            }
            
            if(word.equals(String.valueOf(hossz))){
                wordLabel.setText(String.valueOf(hossz));
                wordLabel.setText("Ügyes vagy, nyertél!" + String.valueOf(hossz));
                //System.out.println("Ügyes vagy, nyertél!");
                break;
            }
            wordLabel.setText(String.valueOf(hossz));
            lifeLabel.setText(Integer.toString(life));
            //System.out.print(wordLabel);
            //System.out.print(lifeLabel);
            
            letterLabel[b].setText(String.valueOf(kivalasztott));
            b++;
            
        }
        
        
        if(life==0){
            wordLabel.setText("Sajnos vesztettél, majd legközelebb!" + String.valueOf(hossz));
            //System.out.println("Sajnos vesztettél, majd legközelebb!");
        }*/
    } 
    }    
}
