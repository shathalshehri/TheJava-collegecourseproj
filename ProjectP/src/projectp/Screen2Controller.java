package projectp;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Screen2Controller implements Initializable {

       @FXML
    private Label label;
       
      final String str ="We started implementing this idea from the obstacles\n" +
"that we faced in our educational journey,\n" +
"and the idea of the application\n" +
"is a measure of a person's perception\n" +
"of his programming knowledge,\n" +
"which begins with asking the player\n" +
"to determine his programmatic level\n" +
"and begins to enter a set of questions\n" +
"from which he chooses the correct answer\n" +
"and programming codes\n" +
"and is evaluated on this basis";
    
     Stage stage = new Stage();
    @FXML
    private Button back;
         
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
      
    }    
       
    @FXML
    private void BackE(ActionEvent event) throws IOException {
     Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
    // name of controll class  object = loader.getControer();
    Scene scene = new Scene (root);
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.setTitle("main page");
    stage.show();
    }

    @FXML
    private void sound(MouseEvent event) {
             if(back.isPressed()){
       String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);

        }
    }
    
}
