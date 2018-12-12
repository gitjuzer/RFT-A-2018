/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akasztofa;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class MarvoltController implements Initializable {

    @FXML
    private Button okbtn;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void exit(ActionEvent event) throws IOException {
    Stage stage = (Stage) okbtn.getScene().getWindow();
    stage.close();
    }
}
