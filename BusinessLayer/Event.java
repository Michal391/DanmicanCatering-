import java.util.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.temporal.Temporal;

public class Event {

    public String EventType;
    public String EventDateTime;
    public int adultsNum;
    public int childrenNum;
    public String deco;


    public int TotalPeople(){
        return childrenNum + adultsNum;
    }

    public ArrayList<Menu> Menus = new ArrayList<>();
	public Temporal event;

    public Event(String EventType, String eventDateTime, int adultsNum, int childrenNum, String deco, ArrayList<Menu> menus){
        this.EventType = EventType;
        this.EventDateTime = eventDateTime;
        this.childrenNum = childrenNum;
        this.adultsNum = adultsNum;
        this.deco = deco;
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

    public void RegisterEvent() throws FileNotFoundException{
        
        boolean valid = false;
        Event evnt = new Event();

        while(valid = false){


            Scanner scr = new Scanner(System.in);

            System.out.println("Enter Type of event");
            String EventType = scr.nextLine();
            setEventType(EventType);

            System.out.println("Enter the event date and time");
            String EventDateTime = scr.nextLine();
            setEventDateTime(EventDateTime);

            System.out.println("Enter number of adults");
            int adultsNum = scr.nextLine();
            setadultnum(adultsNum);

            System.out.println("Enter number of children");
            int childrenNum = scr.nextLine();
            setchildrenNum(childrenNum);

            System.out.println("Decorations?");
            String deco = scr.nextLine();
            setdeco(deco);

            boolean TestEventDetails = equals(evnt);

            System.out.println("Event created :)");

            /*if(TestEventDetails = true) {
                System.out.println(toString());

                try (PrintWriter out = new PrintWriter("EventInfo.txt")){
                    out.println(getEventType() + "@" + getEventDateTime() + "@" + getadultNum() + "@" + getchildrenNum() + "@" + getdeco());
                }

                System.out.println("Event created :)");
                valid = true;
                break;
            }
            else{
                System.oyt.println("Validation failed.");
            }*/




        }
    }
        
}


