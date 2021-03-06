import java.util.Scanner;

import org.graalvm.compiler.asm.aarch64.AArch64Assembler.SystemHint;

import BusinessLayer.Client;


public class Presentation {
   
    public static void main(String[] args){

        Client cl = new Client();
        Event ev = new Event();
        AllBookings ListOfBookings = new AllBookings();
        ListOfBookings.getBookings();
        while(true){
            

        Scanner scr = new Scanner(System.in);
        System.out.println("Welcome to Delicious-Catering");

        System.out.println("Which page do you want to visit? \n1. Client \n2. Owner \n3. Exit");

        int pageOption = scr.nextInt();

        switch(pageOption){

            case 1:

            System.out.println("Welcome to the Client page:");

            System.out.println("Have you register to our system? Y / N");

            String regAnswer = scr.nextLine();

            if(regAnswer == "Y")
            {
                
            }
            else if(regAnswer == "N"){
                cl.RegisterClient();
                ev.RegisterEvent();
                Boolean confirmed = false;
                Random r = new Random();
                int low = 1;
                int high =  1000000;
                int BookingCode = r.nextInt(high-low) + low;
                
                System.out.println("How much will the booking cost?");
                Double BookingCost = scr.nextLine();

                System.out.println("How much did you pay?");
                Double BookingPaid = scr.nextLine();
                if(BookingPaid >= 0.5*BookingCost){
                    confirmed = true;

                }
                
                ListOfBookings.add(new Bookings(BookingCode, confirmed, BookingCost, BookingPaid, cl, ev));
                ListOfBookings.saveBookings();
            }
            System.out.print("Have you made a booking? Y / N ");
            String BookAnswer = scr.nextLine();
        
            if(BookAnswer == "Y"){
                List<Booking> Booking1 = new ArrayList<Booking>();

                System.out.println("--------------------------------------------------------------------");
                System.out.println("Type Event\tDate\tVenue Address\tTotalAdults\tTotalKids\tFood choice \tDecorations");
                System.out.println("--------------------------------------------------------------------");

                for (Booking item : Booking1) {
                    System.out.println(item.type + "\t" + item.date + "\t\t" + item.venueAddress + "\t" + item.numadults + "\t" + item.numkids + "\t" + item.food + "\t" + item.deco);
                }

                System.out.println("--------------------------------------------------------------------");
        
        }
                break;

            case 2:

            System.out.println("Welcome to the Owner page:");

            System.out.println("What do you want to view? \n1. All the clients \n2. All the bookings");

            String ownerAnswer = scr.nextLine();

            if (ownerAnswer == "1"){

            }
            else if (ownerAnswer == "2"){
                
            }


                break;
            case 0:
                break;
        }
        break;
        }
        



        
    }
    
}
