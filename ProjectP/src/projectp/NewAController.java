
package projectp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.stage.Window;
import org.hibernate.Query;
import org.hibernate.Session;
import java.util.List;
import java.util.Optional;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.hibernate.Transaction;



public class NewAController implements Initializable {
    //Cancel button
    @FXML
    private Button can;
    //Confirm button
    @FXML
    private Button con;
    @FXML
    private TextField txt;
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void CancelE(ActionEvent event) throws IOException {
    Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("Screen1.fxml"));
    // name of controll class  object = loader.getControer();
    Scene scene = new Scene (root);
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.show();
    }

    @FXML
    private void NewAE(ActionEvent event) throws IOException {   

             Window owner=con.getScene().getWindow();
        showAlert(Alert.AlertType.CONFIRMATION,owner,"Confirmation message","Your profile and all your progress : achievements, \n" +
    "exclusive rewards , level progress . \n" +
    "Once deleted , the progress cannot be restored");
        
        /*Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("FXMLDoccument.fxml"));
    // name of controll class  object = loader.getControer();
    Scene scene = new Scene (root);
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    stage.setScene(scene);
    stage.show();*/
        
    }
       @FXML
       public void showAlert(Alert.AlertType alertType,Window owner,String title, String message) throws IOException{
        
          
        Alert alert= new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        Optional<ButtonType> result= alert.showAndWait();
        if(result.get()==ButtonType.OK){
        Names del = new Names(txt.getText());
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx3 = null;
            tx3 = session.beginTransaction();
            session.delete(del);
            tx3.commit();
            session.close();
        }
       
        
    }
    
 
    
}