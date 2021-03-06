import java.util.ArrayList;
import java.util.List;

public class Menu {
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
    
    
}
