
package projectp;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import static java.util.Collections.shuffle;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import org.hibernate.Query;
import org.hibernate.Session;


public class Screen9Controller implements Initializable {
 
  
    @FXML
   TextField Text5;
   @FXML
   TextField Text6;
     @FXML
   TextField Text7;
       @FXML
   TextField Text8;
      @FXML
      RadioButton Radio17;
       @FXML
      RadioButton Radio18;
        @FXML
      RadioButton Radio19;
        @FXML
      RadioButton Radio20;
        @FXML
      RadioButton Radio21;
        @FXML
      RadioButton Radio22;
        @FXML
      RadioButton Radio23;
        @FXML
      RadioButton Radio24;
        @FXML
      RadioButton Radio25;           
        @FXML
      RadioButton Radio26;
        @FXML
      RadioButton Radio27;
        @FXML
      RadioButton Radio28;
        @FXML
      RadioButton Radio29;
        @FXML
      RadioButton Radio30;
        @FXML
      RadioButton Radio31;
        @FXML
      RadioButton Radio32;
     
     String q1, a1, q2, a2,q3, a3, q4, a4,q5,a5,q6,a6,q7,a7,q8,a8;
   int score1=0;
   int score=0;
    @FXML
    private Button next;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
           ToggleGroup group= new ToggleGroup();
        Radio17.setToggleGroup(group);
        Radio18.setToggleGroup(group);
        Radio19.setToggleGroup(group);
        Radio20.setToggleGroup(group);
        ToggleGroup group1= new ToggleGroup();
        Radio21.setToggleGroup(group1);
        Radio22.setToggleGroup(group1);
        Radio23.setToggleGroup(group1);
        Radio24.setToggleGroup(group1);
        ToggleGroup group2= new ToggleGroup();
        Radio25.setToggleGroup(group2);
        Radio26.setToggleGroup(group2);
        Radio27.setToggleGroup(group2);
        Radio28.setToggleGroup(group2);
        ToggleGroup group3= new ToggleGroup();
        Radio29.setToggleGroup(group3);
        Radio30.setToggleGroup(group3);
        Radio31.setToggleGroup(group3);
        Radio32.setToggleGroup(group3);
           //populate the list view with the question list
        Session session = HibernateUtil1.getSessionFactory().openSession();
        List<Question> sList = null;
        String queryStr = "from Question";
        Query query = session.createQuery(queryStr);
        sList = query.list();
        session.close();
        System.out.println("Question list size: "+sList.size());
      //System.out.println("contain : \n"+sList);
        shuffle(sList);
        for(Question s:sList)
       {
          
             Text5.setText(sList.get(0).getQuestion());    
             Text6.setText(sList.get(1).getQuestion()); 
             Text7.setText(sList.get(2).getQuestion());
             Text8.setText(sList.get(3).getQuestion()); 
             Radio17.setText(sList.get(0).getA());
             Radio18.setText(sList.get(0).getB());
             Radio19.setText(sList.get(0).getC());
             Radio20.setText(sList.get(0).getD());
             Radio21.setText(sList.get(1).getA());
             Radio22.setText(sList.get(1).getB());
             Radio23.setText(sList.get(1).getC());
             Radio24.setText(sList.get(1).getD());
             Radio25.setText(sList.get(2).getA());
             Radio26.setText(sList.get(2).getB());
             Radio27.setText(sList.get(2).getC());
             Radio28.setText(sList.get(2).getD());
             Radio29.setText(sList.get(3).getA());
             Radio30.setText(sList.get(3).getB());
             Radio31.setText(sList.get(3).getC());
             Radio32.setText(sList.get(3).getD());
              
      }
        
                 q5=Text5.getText();
                 a5=sList.get(0).getCorrectAns();
                 q6=Text6.getText();
                 a6=sList.get(1).getCorrectAns();
                 q7=Text7.getText();
                 a7=sList.get(2).getCorrectAns();
                 q8=Text8.getText();
                 a8=sList.get(3).getCorrectAns();
        
               
     
    }
   
    public void write(String q1,String a1,String q2,String a2,String q3,String a3,String q4,String a4){
        this.q1=q1;
        this.a1=a1;
        this.q2=q2;
        this.a2=a2;
        this.q3=q3;
        this.a3=a3;
        this.q4=q4;
        this.a4=a4;
        
    }
        @FXML
    public void compare(){
    //Question1 
    if(Radio17.isSelected()){
        if(Radio17.getText().equalsIgnoreCase(a5)){
            score=score+10;
             System.out.println("17 "+score);
        }
                     String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);
    }
     if(Radio18.isSelected()){
        if(Radio18.getText().equalsIgnoreCase(a5)){
            score=score+10;
             System.out.println("18 "+score);
        }
                     String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);
    }
      if(Radio19.isSelected()){
        if(Radio19.getText().equalsIgnoreCase(a5)){
            score=score+10;
             System.out.println("19 "+score);
        }
                     String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);
    }
       if(Radio20.isSelected()){
        if(Radio20.getText().equalsIgnoreCase(a5)){
            score=score+10;
             System.out.println("20 "+score);
        }
                     String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);
    }
    }
    @FXML
    public void compare2(){
    //Question 2
     if(Radio21.isSelected()){
        if(Radio21.getText().equalsIgnoreCase(a6)){
            score=score+10;
             System.out.println("21 "+score);
        }
                     String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);
    }
      if(Radio22.isSelected()){
        if(Radio22.getText().equalsIgnoreCase(a6)){
            score=score+10;
             System.out.println("22 "+score);
        }
                     String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);
    }
       if(Radio23.isSelected()){
        if(Radio23.getText().equalsIgnoreCase(a6)){
            score=score+10;
             System.out.println("23 "+score);
        }
                     String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);
    }
        if(Radio24.isSelected()){
        if(Radio24.getText().equalsIgnoreCase(a6)){
            score=score+10;
             System.out.println("24 "+score);
        }
                     String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);
    }
    }
    @FXML
    public void compare3(){
    // Question 3
     if(Radio25.isSelected()){
        if(Radio25.getText().equalsIgnoreCase(a7)){
            score=score+10;
             System.out.println("25 "+score);
        }
                     String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);
    }
      if(Radio26.isSelected()){
        if(Radio26.getText().equalsIgnoreCase(a7)){
            score=score+10;
             System.out.println("26 "+score);
        }
                     String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);
    }
      if(Radio27.isSelected()){
        if(Radio27.getText().equalsIgnoreCase(a7)){
            score=score+10;
             System.out.println("27 "+score);
        }
                     String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);
    }
    if(Radio28.isSelected()){
        if(Radio28.getText().equalsIgnoreCase(a7)){
            score=score+10;
             System.out.println("28 "+score);
        }
                     String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);
    }
    }
    @FXML
    public void compare4(){
  //Question 4
    if(Radio29.isSelected()){
        if(Radio29.getText().equalsIgnoreCase(a8)){
            score=score+10;
             System.out.println("29 "+score);
        }
                     String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);
    }
      if(Radio30.isSelected()){
        if(Radio30.getText().equalsIgnoreCase(a8)){
            score=score+10;
             System.out.println("30 "+score);
        }
                     String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);
    }
      if(Radio31.isSelected()){
        if(Radio31.getText().equalsIgnoreCase(a8)){
            score=score+10;
             System.out.println("31 "+score);
        }
                     String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);
    }
        if(Radio32.isSelected()){
        if(Radio32.getText().equalsIgnoreCase(a8)){
            score=score+10;
             System.out.println("32 "+score);
        }
                     String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);
    }
        
}
 
    public void score(int s){
        this.score1=s;
        score=score+score1;
    }

    @FXML
    private void next1(ActionEvent event) throws IOException {
   
       System.out.println(score);
     javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(getClass().getResource("Screen10.fxml"));
            Parent root = loader.load();
    Screen10Controller controller=loader.getController();
    controller.write(q1, a1, q2, a2, q3, a3, q4, a4, q5, a5, q6, a6, q7, a7, q8, a8);
    controller.score(score);
    Scene scene = new Scene (root);
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    stage.setScene(scene);
     stage.setTitle("Quiz page");
    stage.show();
   
   
    }

    @FXML
    private void sound(MouseEvent event) {
              if(next.isPressed()){
       String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);

        }
    }
    
}

