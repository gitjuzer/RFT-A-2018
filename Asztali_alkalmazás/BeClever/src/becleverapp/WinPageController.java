
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
public class WinPageController implements Initializable {

    public void StartButtonPushed(ActionEvent event) throws IOException{
        Parent StartPageParent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene StartPageScene = new Scene(StartPageParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(StartPageScene);
        window.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    
    
}
