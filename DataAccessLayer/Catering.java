import java.io.File;
import java.util.ArrayList;
import java.util.*;

public class Catering 
{
    private String type;
    private String date;
    private String venueAddress;
    private int numadults;
    private int numkids;
    private String food;
    private Boolean  deco;


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
    //nuut 
    public void Booking(String type, String date, String venueAddress, int numadults, int numkids, String food,
            Boolean deco) {

        this.type = type;
        this.date = date;
        this.venueAddress = venueAddress;
        this.numadults = numadults;
        this.numkids = numkids;
        this.food = food;
        this.deco = deco;
    }

    


  
    
    


}
