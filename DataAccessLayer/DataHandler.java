import java.io.File;
import java.util.ArrayList;
import java.util.*;

public class DataHandler 
{
    private String type;
    private String date;
    private String venueAddress;
    private int numadults;
    private int numkids;
    private String food;
    private Boolean  deco;

    public List<String> GetMenu() 
    {
        List<String> menu = new ArrayList<String>();
        
        File myFile = new File("CateringOptions.txt");

        Scanner sc = new Scanner(myFile);

        while (sc.hasNextLine())
        {
            String[] line = sc.nextLine().split(",");

            menu.add(line[0] +","+ line[1]);

        }
        return menu;
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
