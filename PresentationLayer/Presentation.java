import java.util.Scanner;

import BusinessLayer.Client;


public class Presentation {
    
    public static void main(String[] args){

        while(true){
            Client cl = new Client();

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

            if(regAnswer == "Y"){
                //booking methods
            }
            else if(regAnswer == "N"){
                cl.RegisterClient();
            }
                break;
            //bla bla bla
            case 2:
                break;
            
            case 0:
                break;
        }
        break;
        }
        



        
    }
    
}
