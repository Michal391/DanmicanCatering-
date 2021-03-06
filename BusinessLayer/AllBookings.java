import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.List;
import DataAccessLayer.Booking;
public class AllBookings {

    List<Bookings> ABookings = new ArrayList<Bookings>();

    public List<Booking> BookingsMade(){

        List<Bookings> ABookings = new ArrayList<Bookings>();
        
        //Get Booking info on a list then a text file

    }

    DataHandler dh = new DataHandler();

    public void getBookings(){
        this.ABookings = dh.getBookings();
    }

    public void saveBookings(){
        dh.saveBookings(ABookings);
    }
}
