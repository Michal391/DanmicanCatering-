import java.util.ArrayList;
import java.util.List;

public class Menu {

	public void applyAdultDiscount() {
        String title;
        List<String> items = new ArrayList<>();
        List<Double> prices = new ArrayList<>();

        private Boolean isAdutlMenu = false;

        Menu(String title){
            this.title = title;
        }

        public Menu(String title, List<String> items, List<Double> prices, Boolean isAdultMenu) {
            this.title = title;
            this.items = items;
            this.prices = prices;
            this.isAdultMenu = isAdultMenu;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<String> getItems() {
            return items;
        }

        public List<Double> getPrices() {
            return prices;
        }

        public void setAdults(){
            isAdultMenu = true;
        }

        public void addMenuItem(String item, Double price){
            items.add(item);
            prices.add(price);

        }

        public String getMenuItem(int index) {
            return items.get(index) + " - R" + prices.get(index).toString();

        }

        private void applyDiscount(Double percentageDiscounted){
            price.replaceAll((p) -> p+(percentageDiscounted/100));
        }

        public boolean applyAdultDiscount(){
            if(Boolean.TRUE.equals(isAdultMenu)){
                applyDiscount(15.0);
                return true;
            }
            return false;
        }

        @Override
        public String toString(){
            StringBuilder ret = new StringBuilder();
            ret.append(title +'\n');

            for(int i = 0; i < items.size(); i++){
                ret.append('\n');
                ret.append(getMenuItem(i));
            }

            return ret.toString();
        }

	}

    public class String {
    }

}
