import java.io.File;
import java.util.ArrayList;
import java.util.*;

public class Catering 
{
    public List<CateringOptions> GetOptions() 
    {
        List<CateringOptions> options = new ArrayList<CaterienOptions>();
        
        File myFile = new File("CateringOptions.txt");

        Scanner = new Scanner(myFile);

        while (sc.hasNextLine())
        {
            String[] line = sc.nextLine().split(",");

            options.add(new Option(line[0], line[1], line[2], line[3]));

        }
        return options;
    }


    public List<Booking> GetBookingDataFromFile(){

        FileOutputStream  = new FileOutputStream("BookingDetails.ser");
        
    }
    
    public Void AddBookingsToFile(List<Booking> allBookings){
        
    }
    
    


}
