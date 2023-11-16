package projectp;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author noona
 */
        
@Entity
@Table(name="names")
public class Names {

    
      @Id
       @Column(name="number")
     private String Num ;
      @Column(name="names")
     private String Name ;
     
        public Names() {
    }

    public Names(String num,String Name) {
        this.Name = Name;
        this.Num=num;
    }
    public Names(String num){
        this.Num=num;
    }

    public String getNum() {
        return Num;
    }

    public void setNum(String Num) {
        this.Num = Num;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
}
