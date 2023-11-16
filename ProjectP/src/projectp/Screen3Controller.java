 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectp;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


public class Screen3Controller implements Initializable {
        @FXML
        private TextField txt,txt1;
    @FXML
    private Button beginner;
    @FXML
    private Button adv;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
    }    
         
    @FXML
    private void BegE(ActionEvent event) throws IOException {
       //-------------------
      // String str = txt1.getText();
      Names save = new Names(txt1.getText(),txt.getText());
      
    Session session = HibernateUtil.getSessionFactory().openSession();
    session = HibernateUtil.getSessionFactory().openSession();
    Transaction tx = session.beginTransaction();
        String sId =  (String) session.save(save);
        tx.commit();
        session.close();
        System.out.println("inserted member: "+save.getName());
        
        //---------------------
    Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("Screen4.fxml"));
    // name of controll class  object = loader.getControer();
    Scene scene = new Scene (root);
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.setTitle("Quiz page");
    stage.show();
    }

    @FXML
    private void AdvE(ActionEvent event) throws IOException {
           Names save = new Names(txt1.getText(),txt.getText());
    Session session = HibernateUtil.getSessionFactory().openSession();
    session = HibernateUtil.getSessionFactory().openSession();
    Transaction tx = session.beginTransaction();
        String sId =  (String) session.save(save);
        tx.commit();
        session.close();
        System.out.println("inserted member: "+save.getName());
        
        //---------------------
    Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("Screen11.fxml"));
    // name of controll class  object = loader.getControer();
    Scene scene = new Scene (root);
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    stage.setScene(scene);
     stage.setTitle("Quiz page");
    stage.show();
    }

    @FXML
    private void sound(MouseEvent event) {
             if(beginner.isPressed()){
       String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);

        }
                  if(adv.isPressed()){
       String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);

        } 
    }
    
}
