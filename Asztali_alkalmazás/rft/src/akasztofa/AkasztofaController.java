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
    private Label wordLabel;
    @FXML
    private Label letterLabel1;
    private Label letterLabel2;
    private Label letterLabel3;
    private Label letterLabel4;
    private Label letterLabel5;
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
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    @FXML
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
            }*/
            
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
        }
    }
}
