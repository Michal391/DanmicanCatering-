import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Menu {
    DataHandler dh = new DataHandler();
    private String title;
    List<String> MenuItems = new ArrayList<>();
    List<Double> MenuPrices = new ArrayList<>();

    private Boolean AdultMenu = false;

    Menu(String title){
        this.title = title;
    }

    public Menu(String title, List<String> menuitems, List<Double> menuprices, Boolean isAdultMenu) {
        this.title = title;
        this.MenuItems = menuitems;
        this.MenuPrices = menuprices;
        this.AdultMenu = isAdultMenu;
    }

    public String GetTitle() {
        return title;
    }

    public void SetTitle(String title) {
        this.title = title;
    }

    public List<String> GetItems() {
        return MenuItems;
    }

    public List<Double> GetPrices() {
        return MenuPrices;
    }

    public void SetAdults(){
        AdultMenu = true;
    }

    public void AddMenuItem(String menuitem, Double menuprice){
        MenuItems.add(menuitem);
        MenuPrices.add(menuprice);

    }

    public String GetMenuItem(int index) {
        return MenuItems.get(index) + " - R" + MenuPrices.get(index).toString();

    }

    private void ApplyDiscount(Double percentageDiscounted){
        MenuPrices.replaceAll((p) -> p+(percentageDiscounted/100));
    }

    public boolean ApplyAdultDiscount(){
        if(Boolean.TRUE.equals(AdultMenu)){
            ApplyDiscount(15.0);
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(title +'\n');

        for(int i = 0; i < MenuItems.size(); i++){
            sb.append('\n');
            sb.append(GetMenuItem(i));
        }

        return sb.toString();
    }

    public void CreateMenu(){
        String[] menuarr;
        boolean menuNotFinished = false;
        List<String> menuI = new ArrayList<String>();
        menuI = dh.GetMenu();
        Scanner scr = new Scanner(System.in);
        String food = "";
        double price ;
        

        while(menuNotFinished == true ){

            System.out.print("\033[H\033[2J");  
            System.out.flush();
            
            for(String menuitem : menuI){
                menuarr = menuitem.split(",");
    
                System.out.println(menuarr[0]+" R"+menuarr[1]);
    
            }

            System.out.println("Choose and option to add to the menu OR press 5 to close");
            int menuOption = scr.nextInt();

            switch(menuOption){
                case 1:
                MenuItems.add("Cheese burgers with Magnum ice cream");
                MenuPrices.add(49.99);
                break;
                
                case 2:
                MenuItems.add("Mince and rice with Caramel treat");
                MenuPrices.add(69.99);
                break;

                case 3:
                MenuItems.add("Steak and Salad with Italian Kisses");
                MenuPrices.add(420.99);
                break;

                case 4:
                MenuItems.add("Lasagne with Triple Chocolate Cupcakes");
                MenuPrices.add(666.99);
                break;

                case 5:
                menuNotFinished = false;
                break;

            }
        }
    }
}
