/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectp;




import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.io.File;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;
import javafx.stage.Window;


public class Screen1Controller implements Initializable {

    @FXML
    private CheckBox MusicE;
    @FXML
    private CheckBox SoundE;
    @FXML
    private Button contact;
    @FXML
    private Button btn;
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
   
    @FXML
    private void ContactUs(ActionEvent event) throws IOException {
        
    Parent root = FXMLLoader.load(getClass().getResource("Contact.fxml"));
    // name of controll class  object = loader.getControer();
    Scene scene = new Scene (root);
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.setTitle("Contact Us");
    stage.show();
    }

    @FXML
    private void NewAccountE(ActionEvent event) throws IOException {
       
             Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("NewA.fxml"));
    // name of controll class  object = loader.getControer();
    Scene scene = new Scene (root);
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.setTitle("New account ");
    stage.show();
    
    }

      
      
    @FXML
    private void MusicE(ActionEvent event) {
        String path="/Sounds/Music.mp3";
         Media media= new Media(new File(path).toURI().toString());
         MediaPlayer mediaPlayer = new MediaPlayer(media);    
        mediaPlayer.setAutoPlay(true);
       Screen2Controller sc=new Screen2Controller();
    
    }
    

    @FXML
    private void SoundE(ActionEvent event) {
       String path="/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
       Screen4Controller sc= new Screen4Controller();
       if(SoundE.isSelected()){
           mediaPlayer.setAutoPlay(true);
       }
        
           
    }

    @FXML
    private void sound(MouseEvent event) {
             if(btn.isPressed()){
       String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);

        }
                  if(contact.isPressed()){
       String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);

        }
    }
    
}
