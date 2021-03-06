import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.*;


import BusinessLayer.AllBookings;

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

    public void SavedBookings(List<AllBookings> listofbookings) {

        FileOutputStream fos = new FileOutputStream("ListOfAllBookings.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(listofbookings);

        oos.close();
        fos.close();

    }

    public List<AllBookings> GetBookings(){

        FileInputStream fis = new FileInputStream("ListOfAllBookings.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

            if (fis.available() != -1) {
                return   (List<AllBookings>)ois.readObject();
            }
            
            fis.close();
            ois.close();
    }

}
