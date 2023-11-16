package projectp;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import java.io.IOException;
import java.util.List;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import org.hibernate.Query;
import org.hibernate.Session;
/**
 * FXML Controller class
 *
 * @author noona
 */
public class AdvResultController implements Initializable {

    TextField result;
    @FXML
    Label degree;
    @FXML
    Label deg;
    @FXML
    ImageView rea , rea1;        
    String q1, a1, q2, a2,q3, a3, q4, a4,q5,a5,q6,a6,q7,a7,q8,a8,q9,a9,q10,a10,q11,a11,q12,a12;
   int score=0;
    @FXML
    private Button ShowSolution;
    @FXML
    private Button Exit;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
    }
    public void setlabel(int s){
        
        this.score=s;
        deg.setText(Integer.toString(score));
        if(score == 120){
            //
            Image image = new Image("https://f.top4top.io/p_1803o6y9f1.gif");
        rea.setImage(image);
         image = new Image("https://e.top4top.io/p_1803hlmsd1.gif");
        rea1.setImage(image);
        
        }
        else if(score > 50){
            Image image = new Image("https://f.top4top.io/p_1803h4khu1.gif"); // 
        rea1.setImage(image);
    
        
        
        }
        else if(score <= 50 && score != 0){
             Image image = new Image("https://f.top4top.io/p_1803eyj2k2.gif");// 
        rea.setImage(image);
        //https://l.top4top.io/p_1803bh8vj1.png
        image = new Image("https://l.top4top.io/p_1803bh8vj1.png"); // 
        rea1.setImage(image);
        
        }
        else if(score == 0 ){
            //https://k.top4top.io/p_1803tn4ie1.gif
               Image image = new Image("https://l.top4top.io/p_1803cgbu71.gif");
        rea.setImage(image);
         image = new Image("https://k.top4top.io/p_18037mtzg1.gif");
        rea1.setImage(image);
        }
    }
      public void write(String q1,String a1,String q2,String a2,String q3,String a3,String q4,String a4,String q5,String a5,String q6,String a6,String q7,String a7,String q8,String a8,String q9,String a9,String q10,String a10,String q11,String a11,String q12,String a12){
        this.q1=q1;
        this.a1=a1;
        this.q2=q2;
        this.a2=a2;
        this.q3=q3;
        this.a3=a3;
        this.q4=q4;
        this.a4=a4;
        this.q5=q5;
        this.a5=a5;
        this.q6=q6;
        this.a6=a6;
        this.q7=q7;
        this.a7=a7;
        this.q8=q8;
        this.a8=a8;
        this.q9=q9;
        this.a9=a9;
        this.q10=q10;
        this.a10=a10;
        this.q11=q11;
        this.a11=a11;
        this.q12=q12;
        this.a12=a12;
        
    }
        
    @FXML
      private void showSolution(ActionEvent event) throws IOException {
    javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(getClass().getResource("AdvSol.fxml"));
   Parent root = loader.load();
    
    AdvSolController controller=loader.getController();
    controller.transferMessage(q1, a1, q2, a2, q3, a3, q4, a4, q5, a5, q6, a6, q7, a7, q8, a8, q9, a9, q10, a10, q11, a11, q12, a12);
    // name of controll class  object = loader.getControer();
    Scene scene = new Scene (root);
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    stage.setScene(scene);
     stage.setTitle("The solution");
    stage.show();
    }
      
      @FXML
        private void Exit(ActionEvent event) throws IOException {
      Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
    // name of controll class  object = loader.getControer();
    Scene scene = new Scene (root);
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    stage.setScene(scene);
     stage.setTitle("main page");
    stage.show();
    }
      /*
       @FXML
       
         private void Write(ActionEvent event) throws IOException {
             
         javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(getClass().getResource("Screen.fxml"));
    Parent root = loader.load();
    // name of controll class  object = loader.getControer();
    
    Stage stage = new Stage();
    stage.setScene(new Scene(root));
    stage.show();
    }
         */

    @FXML
    private void sound(MouseEvent event) {
          if(ShowSolution.isPressed()){
       String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);

        }
            if(Exit.isPressed()){
       String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);

        } 
    }
    
}