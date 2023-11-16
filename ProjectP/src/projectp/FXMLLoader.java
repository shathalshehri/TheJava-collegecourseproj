/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectp;


import java.io.FileNotFoundException;
import java.net.URL;
import javafx.scene.layout.Pane;

/**
 *
 * @author noona
 */
public class FXMLLoader {
    private Pane view ;
    public Pane getPane(String fileName) throws FileNotFoundException{
        try{
            URL fileUrl = ProjectP.class.getResource("/projectp/"+fileName+".fxml");
            if(fileUrl == null ){
                throw new java.io.FileNotFoundException("FXML fike is not found");
            }
            view = new FXMLLoader().load(fileUrl);
        }
        catch(Exception e){
            System.out.println("No page"+fileName);
        }
        return view;
    }

    Pane load(URL fileUrl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
