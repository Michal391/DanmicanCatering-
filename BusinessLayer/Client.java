import java.util.*;
import java.io.*;

import PresentationLayer.*;


public class Client {

    private String Fname;
    private String Lname;
    private String Phonenumber;

    public Client(String FirstName, String LastName, String PhoneNum){

        this.Fname = FirstName;
        this.Lname = LastName;
        this.Phonenumber = PhoneNum;

    }

    public String getfname() {
        return Fname;
    }

    public void setfname(String Fname) {
        this.Fname = Fname;
    }

    public String getlname(){
        return Lname;
    }

    public void setlname(String Lname){
        this.Lname = Lname;
    }

    public String getphonenumber(){
        return Phonenumber;
    }

    public void setphonenumber(String Phonenumber){
        this.Phonenumber = Phonenumber;
    }

    //change the client details into 1 string 
    @Override
    public String toString(){
        return "Client first name="+getfname()+",Client last name="+getlname()+",Phonenumber="+getphonenumber();
    }

    //Check if everything is good
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Client other = (Client) obj;
        if (Fname == null) {
            if (other.Fname != null)
                return false;
        } else if (!Fname.equals(other.Fname))
            return false;
        if (Lname == null) {
            if (other.Lname != null)
                return false;
        } else if (!Lname.equals(other.Lname))
            return false;
        if (Phonenumber == null) {
            if (other.Phonenumber != null)
                return false;
        } else if (!Phonenumber.equals(other.Phonenumber))
            return false;
        return true;
    }

    public Client RegisterClient() throws FileNotFoundException{

        boolean valid = false;
        Client cl = new Client();
    


        while (valid = false){

            Scanner scr = new Scanner(System.in);

            System.out.println("To register: Enter your name");
    
            String fname = scr.nextLine();
            setfname(fname);
    
            System.out.println("To register: Enter your surname");
    
            String lname = scr.nextLine();
            setlname(lname);
    
            System.out.println("To register: Enter your phone number");
    
            String fphone = scr.nextLine();
            setphonenumber(fphone);
            
            boolean testDetails = equals(cl);
            System.out.println("Registration complete!");

            /*if (testDetails = true){

                System.out.println(toString());
               

                try (PrintWriter out = new PrintWriter("ClientInfo.txt")) {
                    out.println(getfname()+"@"+getlname()+"@"+getphonenumber());
                }

                System.out.println("Registration complete!");
                valid = true;
                break;
            }
            else
            {
                System.out.println("Validation failed, try again!");
            }*/
            
        }


    }
    public List<Client> ViewClients() throws FileNotFoundException, IOException
	{
		List<Client> clientlist = new ArrayList<Client>();
		
		File file = new File("ClientInfo.txt");
		Scanner sc = new Scanner(file);
		
		if(file.exists())
		{
			while(sc.hasNextLine())
			{
				String[] line = sc.nextLine().split("@");
				clientlist.add(new Client(line[0], line[1], line[2]));
			}
			
			return clientlist;
		}
		else
			return null;
	}
}