package projectp;

import java.io.File;
import java.nio.file.Paths;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

/**
 *
 * @author noona
 */
public class ProjectP extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
      
         File f = new File("src/Sounds/Music.mp3");
        Media m = new Media(f.toURI().toString());
        MediaPlayer mp = new MediaPlayer(m);
       
        Parent root = FXMLLoader.load(getClass().getResource("lLogo.fxml"));
      
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
         stage.setTitle("Welcome to our Application");
        stage.show();
        mp.play();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
