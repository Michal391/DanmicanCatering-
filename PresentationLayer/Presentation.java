import java.util.Scanner;

import org.graalvm.compiler.asm.aarch64.AArch64Assembler.SystemHint;

import BusinessLayer.Client;


public class Presentation {
   
    public static void main(String[] args){

        while(true){
            Client cl = new Client();
            Bookings bk = new Bookings();

        Scanner scr = new Scanner(System.in);
        System.out.println("Welcome to Delicious-Catering");

        System.out.println("Which page do you want to visit? \n1. Client \n2. Owner \n3. Exit");

        int pageOption = scr.nextInt();

        switch(pageOption){

            case 1:
            System.out.print("\033[H\033[2J");  
            System.out.flush();

            System.out.println("Welcome to the Client page:");

            System.out.println("Have you register to our system? Y / N");

            String regAnswer = scr.nextLine();

            if(regAnswer == "Y")
            {
                
            }
            else if(regAnswer == "N"){
                cl.RegisterClient();
            }
                break;
            //bla bla bla
            //Weereens ek weet nie of dit onder case 2 of 1 kom nie. Volgens my(Wian) moet die eienaar kan sien wat die bookings al is. Ons moet net nog code hoe die bookings in n list in gaan en dan na n file toe
            case 2:
            System.out.print("Any bookings made? Y / N ");
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
            
            case 0:
                break;
        }
        break;
        }
        



        
    }
    
}
