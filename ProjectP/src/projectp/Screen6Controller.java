package projectp;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;


public class Screen6Controller implements Initializable {

    @FXML
    Label qlabel, Alabel,qlabel1,Alabel1, qlabel2, Alabel2, qlabel3, Alabel3,qlabel4,Alabel4,qlabel5,Alabel5
    ,qlabel6,Alabel6,qlabel7,Alabel7,qlabel8,Alabel8,qlabel9,Alabel9,qlabel10,Alabel10,qlabel11,Alabel11;
    @FXML
    private Button End;
  
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
   
    }
  
    public void transferMessage(String q1,String a1,String q2,String a2,String q3,String a3,String q4,String a4,String q5,String a5,String q6,String a6,String q7,String a7,String q8,String a8,String q9,String a9,String q10,String a10,String q11,String a11,String q12,String a12){
    this.qlabel.setText(q1);
    this.Alabel.setText(a1);
    this.qlabel1.setText(q2);
    this.Alabel1.setText(a2);
    this.qlabel2.setText(q3);
    this.Alabel2.setText(a3);
    this.qlabel3.setText(q4);
    this.Alabel3.setText(a4);
    this.qlabel4.setText(q5);
    this.Alabel4.setText(a5);
    this.qlabel5.setText(q6);
    this.Alabel5.setText(a6);
    this.qlabel6.setText(q7);
    this.Alabel6.setText(a7);
    this.qlabel7.setText(q8);
    this.Alabel7.setText(a8);
    this.qlabel8.setText(q9);
    this.Alabel8.setText(a9);
    this.qlabel9.setText(q10);
    this.Alabel9.setText(a10);
    this.qlabel10.setText(q11);
    this.Alabel10.setText(a11);
    this.qlabel1.setText(q12);
    this.Alabel1.setText(a12);
    }
  
 
    
    @FXML
    private void EndE(ActionEvent event) throws IOException {     
        Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("Screen7.fxml"));
    // name of controll class  object = loader.getControer();
    Scene scene = new Scene (root);
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    stage.setScene(scene);
     stage.setTitle("End page");
    stage.show();
    }

    @FXML
    private void sound(MouseEvent event) {
              if(End.isPressed()){
       String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);

        }
    }
    
}
