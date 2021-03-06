import java.time.temporal.ChronoUnit;
import java.util.*;
import java.time.LocalDateTime;

public class Bookings {

    public int BookingCode;
    private boolean Bookingconfirmed = false;
    public Double BookingCost;
    public Double BookingPaid;
    public Client clientcls;
    private Event eventcls;

    public Event getEventMethod(){

        Event returnVAR = new Event(eventcls);
        //check if the numebr of people is above 40 for the discount factor
        if(eventcls.getGroup() > 40){
            returnVAR.AdultDiscountMenus();
        }
       return returnVAR;
    }

    //This is the method that will handle the payment

    public void BookingPayment(double bookingamount){
        if(BookingPaid>=BookingCost){
            return;
        }

        BookingPaid += bookingamount;

        if(BookingPaid >= (BookingCost*0.50) && ChronoUnit.DAYS.between(LocalDateTime.now(), eventcls.event) >15){
            Bookingconfirmed = true;
        }
    }

    //This method will change all the booking details to a string, making it nice and neat
    @Override
    public String toString(){

        StringBuilder sb = new StringBuilder();

        sb.append("Booking: "+ BookingCode);
        sb.append("\n");
        sb.append("Cost: "+BookingCost);
        sb.append("\n");
        sb.append("Paid: " +BookingPaid);
        sb.append("\n");
        sb.append("Confirmed: "+ Bookingconfirmed);
        sb.append("\n");
        sb.append("Client: "+ clientcls.toString());
        sb.append("\n");
        sb.append("Event:" +  getClass().toString());
        sb.append("\n");

        return sb.toString();


    }
}