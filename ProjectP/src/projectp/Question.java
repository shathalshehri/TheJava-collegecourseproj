package projectp;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="QUESTION")
public class Question {
    
     @Id          
     @Column(name="question")      
     private String  question;       
     @Column(name="A")
     private String  A;
     @Column(name="B")
     private String  B; 
     @Column(name="C")
     private String  C;
     @Column(name="D")
     private String  D;
       @Column(name="CorrectAns")
     private String  CorrectAns;

    public Question() {
    }

    public Question(String question, String A, String B, String C, String D,String CorrectAns) {
        this.question = question;
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        this.CorrectAns=CorrectAns;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getA() {
        return A;
    }

    public void setA(String A) {
        this.A = A;
    }

    public String getB() {
        return B;
    }

    public void setB(String B) {
        this.B = B;
    }

    public String getC() {
        return C;
    }

    public void setC(String C) {
        this.C = C;
    }

    public String getD() {
        return D;
    }

    public void setD(String D) {
        this.D = D;
    }
    
      public String getCorrectAns() {
        return CorrectAns;
    }

    public void setCorrectAns(String CorrectAns) {
        this.CorrectAns = CorrectAns;
    }

     
   @Override
    public String toString() {
        return question;
                /*
                "FirstName='" + FirstName + '\'' +
                ", LName='" + LastName + '\'' +
                ", Phone=" + Phone +
                ", Email='" + Email + '\'' +
                '}';*/

     
     
}
}