/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akasztofa;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
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
    Button visszabtn;
    TextField kivalasztField;
    Label lifeLabel;
    Label wordLabel;
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
        
        //még nem működőképes
        
        String[] words = {"welcome", "banana", "computer", "cow", "rain", "water" };
        String word = words[(int) (Math.random() * words.length)];
        int lifeLabel = 5;
        //lifeLabel = new Label("5");
        //lifeLabel.setText(Integer.toString(5));
        
        char[] wordLabel = new char[word.length()];
        int i = 0;
        while(i < word.length()){
            wordLabel[i]='-';
            if(word.charAt(i) == ' '){
                wordLabel[i]= ' ';
            }
            i++;
        }
        System.out.print(wordLabel);
        //System.out.println("Maradék élet = " + lifeLabel.getText());
        System.out.print(lifeLabel);
        
        Scanner s = new Scanner(System.in); //to read character
        
        ArrayList<Character> l = new ArrayList<Character>();
        
        //while(Integer.parseInt((String)lifeLabel.toString())>0){
        while(lifeLabel>0){
            char kivalasztField = s.next().charAt(0);
            
            if(l.contains(kivalasztField)){
                System.out.println("Ezt a betűt már egyszer beírtad!"); //letterLabel bővül a beírt betűvel
                continue;
            }
            
            l.add(kivalasztField);
            
            if(word.contains(kivalasztField+"")){
                for(int y=0; y<word.length(); y++){
                    if(word.charAt(y)==kivalasztField){
                        wordLabel[y]=kivalasztField;
                    }
                }
            }
            else{
                //lifeLabel--;
            }
            
            if(word.equals(String.valueOf(wordLabel))){
                System.out.print(wordLabel);
                System.out.println("Ügyes vagy, nyertél!");
                break;
            }
            
            System.out.print(wordLabel);
            System.out.print(lifeLabel);
            //System.out.println("Maradék élet = " + lifeLabel.getText());
        }
        
        //if(Integer.parseInt((String)lifeLabel.toString())==0){
        if(lifeLabel==0){
            System.out.println("Sajnos vesztettél, majd legközelebb!");
        }
    }
}
