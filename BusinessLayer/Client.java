import java.util.*;
import java.io.*;


public class Client {

    private String Fname;
    private String Lname;
    private String Phonenumber;

    public String getfname() {
        return Fname;
    }

    public void setfname(String Fname) {
        this.Fname = Fname;
    }

    public String getlname(){
        return Lname;
    }

    public void setlame(String Lname){
        this.Lname = Lname;
    }

    public String getphonenumber(){
        return Phonenumber;
    }

    public void setphonenumber(String Phonenumber){
        this.Phonenumber = Phonenumber;
    }

    //change the client details into 1 string 
    @Override
    public String toString(){
        return "Client first name="+Fname+",Client last name="+Lname+",Phonenumber="+Phonenumber;
    }

    //Check if everything is good
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Client other = (Client) obj;
        if (Fname == null) {
            if (other.Fname != null)
                return false;
        } else if (!Fname.equals(other.Fname))
            return false;
        if (Lname == null) {
            if (other.Lname != null)
                return false;
        } else if (!Lname.equals(other.Lname))
            return false;
        if (Phonenumber == null) {
            if (other.Phonenumber != null)
                return false;
        } else if (!Phonenumber.equals(other.Phonenumber))
            return false;
        return true;
    }
}