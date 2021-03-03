import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.List;
import DataAccessLayer.Booking;
public class Booking {
    public List<Booking> BookingsMade(){

        List<Booking> Booking1 = new LinkedList<Booking>();
        
        //Get Booking info on a list then a text file

    }

    try{
        FileOutputStream fos = new FileOutputStream(/*Location of booking textfile */);
        ObjectInputStream oos = new ObjectInputStream(fos);

        //Weet nie of die nodig is nie 
        for (Booking item : Booking1){
            oos.writeObject(item);
            oos.reset();
        }

        oos.close();
        fos.close();
    }

    catch (Exception e){
        System.out.println("Error" + e);
    }
    return Booking1;


}
}
