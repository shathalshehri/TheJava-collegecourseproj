package projectp;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author noona
 */
public class ContactController implements Initializable {

    @FXML
    private Button Back;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BackE1(ActionEvent event) throws IOException {
         Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
    // name of controll class  object = loader.getControer();
    Scene scene = new Scene (root);
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.setTitle("Main page");
    stage.show();
    }

    @FXML
    private void sound(MouseEvent event) {
           if(Back.isPressed()){
       String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);

        }
    }
    
    
}
