
package becleverapp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author PB
 */
public class Question7Controller implements Initializable {

    public void wrongAnswerButtonPushed(ActionEvent event) throws IOException{
        Parent wrongAnswerParent = FXMLLoader.load(getClass().getResource("TryAgain7.fxml"));
        Scene LosePageScene = new Scene(wrongAnswerParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(LosePageScene);
        window.show();
    }
    public void goodAnswerButtonPushed(ActionEvent event) throws IOException{
        Parent Question8Parent = FXMLLoader.load(getClass().getResource("Question8.fxml"));
        Scene Question8Scene = new Scene(Question8Parent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(Question8Scene);
        window.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    
    
}
