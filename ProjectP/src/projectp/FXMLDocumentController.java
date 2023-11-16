/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;


/**
 *
 * @author noona
 */

public class FXMLDocumentController implements Initializable {
    
    
   
    private final String str ="We started implementing this idea from the obstacles\n" +
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
    private Button start;
    @FXML
    private Button setting;
    @FXML
    private Button about;
 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  

    @FXML
    private void STARTE(ActionEvent event) throws IOException {
       
    Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("Screen3.fxml"));
    // name of controll class  object = loader.getControer();
    Scene scene = new Scene (root);
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.setTitle("Login");
    stage.show();
    }
//--------------------------------------------------------------------------
    @FXML
    private void SETTINGE(ActionEvent event) throws IOException {
         Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("Screen1.fxml"));
    // name of controll class  object = loader.getControer();
    Scene scene = new Scene (root);
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.setTitle("Setting");
    stage.show();
    }
    

    @FXML
    private void ABOUTE(ActionEvent event) throws IOException {
    Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("Screen2.fxml"));
    // name of controll class  object = loader.getControer();
    Scene scene = new Scene (root);
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    stage.setScene(scene);
     stage.setTitle("About us");
    stage.show();
 /* Text text = new Text(str);
   
     StackPane root1 = new StackPane(text);
  
    
       root1.setAlignment(Pos.CENTER);
      

        final IntegerProperty i = new SimpleIntegerProperty(0);
        Timeline timeline = new Timeline();
        KeyFrame keyFrame = new KeyFrame(
                Duration.seconds(0.1),
                event -> {
                    if (i.get() > str.length()) {
                        timeline.stop();
                    } else {
                        text.setText(str.substring(0, i.get()));
                        i.set(i.get() + 1);
                    }
                });
        timeline.getKeyFrames().add(keyFrame);
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
        
          Scene scene = new Scene(root1,Color.WHITE);
     stage.setScene(scene);
     stage.show();
     
           
    
    
    */
    
    // name of controll class  object = loader.getControer();
    
    
    }

    @FXML
    private void sound(MouseEvent event) {
     if(start.isPressed()){
       String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);

        }
    if(about.isPressed()){
       String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);

        }
     if(setting.isPressed()){
       String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);

        }
    }

    
    
    
}
