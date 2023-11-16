
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


public class Screen10Controller implements Initializable {
 
  
    @FXML
   TextField Text1;
   @FXML
   TextField Text2;
     @FXML
   TextField Text3;
       @FXML
   TextField Text4;
      @FXML
      RadioButton Radio1;
       @FXML
      RadioButton Radio2;
        @FXML
      RadioButton Radio3;
        @FXML
      RadioButton Radio4;
        @FXML
      RadioButton Radio5;
        @FXML
      RadioButton Radio6;
        @FXML
      RadioButton Radio7;
        @FXML
      RadioButton Radio8;
        @FXML
      RadioButton Radio9;           
        @FXML
      RadioButton Radio0;
        @FXML
      RadioButton Radio11;
        @FXML
      RadioButton Radio12;
        @FXML
      RadioButton Radio13;
        @FXML
      RadioButton Radio14;
        @FXML
      RadioButton Radio15;
        @FXML
      RadioButton Radio16;
       
      String q1, a1, q2, a2,q3, a3, q4, a4,q5,a5,q6,a6,q7,a7,q8,a8,q9,a9,q10,a10,q11,a11,q12,a12;
      int score =0;
    @FXML
    private Button next;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
               ToggleGroup group= new ToggleGroup();
        Radio1.setToggleGroup(group);
        Radio2.setToggleGroup(group);
        Radio3.setToggleGroup(group);
        Radio4.setToggleGroup(group);
        ToggleGroup group1= new ToggleGroup();
        Radio5.setToggleGroup(group1);
        Radio6.setToggleGroup(group1);
        Radio7.setToggleGroup(group1);
        Radio8.setToggleGroup(group1);
        ToggleGroup group2= new ToggleGroup();
        Radio9.setToggleGroup(group2);
        Radio0.setToggleGroup(group2);
        Radio11.setToggleGroup(group2);
        Radio12.setToggleGroup(group2);
        ToggleGroup group3= new ToggleGroup();
        Radio13.setToggleGroup(group3);
        Radio14.setToggleGroup(group3);
        Radio15.setToggleGroup(group3);
        Radio16.setToggleGroup(group3);
        
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
          
             Text1.setText(sList.get(0).getQuestion());    
             Text3.setText(sList.get(1).getQuestion()); 
             Text2.setText(sList.get(2).getQuestion());
             Text4.setText(sList.get(3).getQuestion()); 
             Radio1.setText(sList.get(0).getA());
             Radio2.setText(sList.get(0).getB());
             Radio3.setText(sList.get(0).getC());
             Radio4.setText(sList.get(0).getD());
             Radio5.setText(sList.get(1).getA());
             Radio6.setText(sList.get(1).getB());
             Radio7.setText(sList.get(1).getC());
             Radio8.setText(sList.get(1).getD());
             Radio9.setText(sList.get(2).getA());
             Radio0.setText(sList.get(2).getB());
             Radio11.setText(sList.get(2).getC());
             Radio12.setText(sList.get(2).getD());
             Radio13.setText(sList.get(3).getA());
             Radio14.setText(sList.get(3).getB());
             Radio15.setText(sList.get(3).getC());
             Radio16.setText(sList.get(3).getD());
              
      }
                 q9=Text1.getText();
                 a9=sList.get(0).getCorrectAns();
                 q10=Text3.getText();
                 a10=sList.get(1).getCorrectAns();
                 q11=Text2.getText();
                 a11=sList.get(2).getCorrectAns();
                 q12=Text4.getText();
                 a12=sList.get(3).getCorrectAns();
     
    }
    
  public void write(String q1,String a1,String q2,String a2,String q3,String a3,String q4,String a4,String q5,String a5,String q6,String a6,String q7,String a7,String q8,String a8){
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
        
    }
  @FXML
    public void compare(){
        //Question 1
 if(Radio1.isSelected()){
        if(Radio1.getText().equalsIgnoreCase(a9)){
            score=score+10;
             System.out.println("1 "+score);
             
        }
         String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);
    }
if(Radio2.isSelected()){
        if(Radio2.getText().equalsIgnoreCase(a9)){
            score=score+10;
             System.out.println("2 "+score);
                 
        }
         String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);
    }
 if(Radio3.isSelected()){
        if(Radio3.getText().equalsIgnoreCase(a9)){
            score=score+10;
             System.out.println("3 "+score);
              
        }
         String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);
    }
if(Radio4.isSelected()){
        if(Radio4.getText().equalsIgnoreCase(a9)){
            score=score+10;
             System.out.println("4 "+score);
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
        if(Radio5.isSelected()){
        if(Radio5.getText().equalsIgnoreCase(a10)){
            score=score+10;
             System.out.println("5 "+score);
                
        }
         String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);
    }
 if(Radio6.isSelected()){
        if(Radio6.getText().equalsIgnoreCase(a10)){
            score=score+10;
             System.out.println("6 "+score);  
        }
         String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);
    }
 if(Radio7.isSelected()){
        if(Radio7.getText().equalsIgnoreCase(a10)){
            score=score+10;
            System.out.println("7 "+score);
               
        }
         String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);
    }
 if(Radio8.isSelected()){
  if(Radio8.getText().equalsIgnoreCase(a10)){
            score=score+10;
            System.out.println("8 "+score);
         
        }
   String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);
    }
    }
    @FXML 
    public void compare3(){
 //Question 3
 if(Radio9.isSelected()){
        if(Radio9.getText().equalsIgnoreCase(a11)){
            score=score+10;
            System.out.println("9 "+score);
              
        }
         String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);
    }
if(Radio0.isSelected()){
        if(Radio0.getText().equalsIgnoreCase(a11)){
            score=score+10;
            System.out.println("10 "+score);
              
        }
         String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);
    }
 if(Radio11.isSelected()){
        if(Radio11.getText().equalsIgnoreCase(a11)){
            score=score+10;
            System.out.println("11 "+score);
               
        }
         String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);
    }
 if(Radio12.isSelected()){
        if(Radio12.getText().equalsIgnoreCase(a11)){
            score=score+10;
            System.out.println("12 "+score);

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
 if(Radio13.isSelected()){
        if(Radio13.getText().equalsIgnoreCase(a12)){
            score=score+10;
            System.out.println("13 "+score);
        }
                String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);
    }
  if(Radio14.isSelected()){
        if(Radio14.getText().equalsIgnoreCase(a12)){
            score=score+10;
            System.out.println("14 "+score);
               
        }
         String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);
    }
   if(Radio15.isSelected()){
        if(Radio15.getText().equalsIgnoreCase(a12)){
            score=score+10;
            System.out.println("15 "+score);
                String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);
        }
    }
  if(Radio16.isSelected()){
        if(Radio16.getText().equalsIgnoreCase(a12)){
            score=score+10;
            System.out.println("16 "+score);
        }
          String path="src/Sounds/Sound.mp3";
       Media media= new Media(new File(path).toURI().toString());
       MediaPlayer mediaPlayer = new MediaPlayer(media); 
           mediaPlayer.setAutoPlay(true);
    }
  
    }
    
    public void score(int s){
        this.score=+s;
    }
    

    @FXML
    private void resultE(ActionEvent event) throws IOException {
        System.out.println(score);
      javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(getClass().getResource("Screen5.fxml"));
            Parent root = loader.load();
    Screen5Controller controller=loader.getController();
  controller.write(q1, a1, q2, a2, q3, a3, q4, a4, q5, a5, q6, a6, q7, a7, q8, a8, q9, a9, q10, a10, q11, a11, q12, a12);
     controller.setlabel(score);
    Scene scene = new Scene (root);
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    stage.setScene(scene);
     stage.setTitle("The Result ");
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

