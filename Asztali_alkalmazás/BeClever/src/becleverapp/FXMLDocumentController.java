
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
 *
 * @author PB
 */
public class FXMLDocumentController implements Initializable {
   

    public void changeScreenButtonPushed(ActionEvent event) throws IOException{
        Parent Question1Parent = FXMLLoader.load(getClass().getResource("Question1.fxml"));
        Scene Question1Scene = new Scene(Question1Parent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(Question1Scene);
        window.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
}
