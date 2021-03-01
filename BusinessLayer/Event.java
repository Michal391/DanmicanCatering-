import java.util.*;
import java.io.Serializable;
import java.time.LocalDateTime;

public class Event {

    public String type;
    public LocalDateTime EventDateTime ;

    public int adultsT;
    public int childrenT;

    public int getGroup(){
        return childrenT + adultsT;
    }

    public ArrayList<Menu> menus = new ArrayList<>();

    public Event(String type, LocalDateTime eventDateTime, int adultsT, int childrenT, ArrayList<Menu> menus){
        this.type = type;
        this.EventDateTime = eventDateTime;
        this.childrenT = childrenT;
        this.adultsT = adultsT;
        this.menus = menus;
    }

    public Event(Event eventcls) {
	}

	public void AdultDiscountMenus(){
        for(Menu menu : menus){
            menu.applyAdultDiscount();
        }
    }

    @Override
    public String toString(){
        StringBuilder ret = new StringBuilder();
        ret.append("A "+type+" Event");
        ret.append('\n');
        ret.append("Is Scheduled for " + Event.toString() + " At:\n" + venue.toString());
        ret.append("\n\n");
        ret.append( String.format("%s people will be present. (%s kids and %s adults)", getGroup(), childrenT, adultsT) );
        ret.append('\n');
        ret.append("The menus are:");
        for (Menu menu : menus) {
            ret.append('\n');
            ret.append(menu.toString());
        }

        return ret.toString();
    }
        
}


