import java.util.*;

public class Presentation {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);
        System.out.println("Welcome to Delicious-Catering");

        System.out.println("Which page do you want to visit? \n1. Owner \n2. Employee \n3. Exit");

        int pageOption = scr.nextInt();

        switch(pageOption){

            case 1:
            System.out.print("\033[H\033[2J");  
            System.out.flush();

            System.out.println("Welcome to the Client page:");

            System.out.println("First you would need to register in our system ");
            
                break;
            
            case 2:
                break;
            
            case 0:
                break;
        }



        
    }
    
}
