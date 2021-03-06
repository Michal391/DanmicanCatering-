import java.util.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.temporal.Temporal;

public class Event {

    public String EventType;
    public String EventDateTime;

    public int adultsNum;
    public int childrenNum;

    public int TotalPeople(){
        return childrenNum + adultsNum;
    }

    public ArrayList<Menu> Menus = new ArrayList<>();
	public Temporal event;

    public Event(String EventType, String eventDateTime, int adultsNum, int childrenNum, ArrayList<Menu> menus){
        this.EventType = EventType;
        this.EventDateTime = eventDateTime;
        this.childrenNum = childrenNum;
        this.adultsNum = adultsNum;
        this.Menus = menus;
    }

    public Event(Event eventcls) {
	}

	public void AdultDiscountMenus(){
        for(Menu menu : Menus){
            menu.ApplyAdultDiscount();
        }
    }

    //This method will change all the event details to a string, making it nice and neat
    @Override
    public String toString(){
        StringBuilder ret = new StringBuilder();
        ret.append("A "+EventType+" Event");
        ret.append('\n');
        ret.append("Is Scheduled for " + EventDateTime.toString());
        ret.append("\n\n");
        ret.append( String.format("%s people will be present. (%s kids and %s adults)", TotalPeople(), childrenNum, adultsNum) );
        ret.append('\n');
        ret.append("The menus are:");
        for (Menu menu : Menus) {
            ret.append('\n');
            ret.append(menu.toString());
        }

        return ret.toString();
    }
        
}


