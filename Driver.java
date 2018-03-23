package Mininet;//common package
import java.util.Scanner;//import for Scanner-I/O

//author subbiksa

public abstract class Driver extends Profile {
	public Driver(String profileName) {
		super(profileName);//constructor
			}
	       public static void main(String args[]) {
		   Profile p1= new Profile("Chandler Bing");//object creation
		   p1.getAge(30); 
		   p1.getStatus("Advertising Head-Schwarzkorf");
		   p1.getImage("chanman.jpeg");
		   p1.getfriend1("Monica Geller");
		   p1.getFriend2("Joey Tribbiani");
		   Profile p2=new Profile("Joey Tribbiani");
		   p2.getAge(32);
		   p2.getStatus("Actor-Days Of our Lives");
		   p2.getImage("drakeramoray.png");
		   p2.getfriend1("Chandler Bing");
		   p2.getFriend2("Rachel Greene");
		   Profile p3=new Profile("Phoebe Buffay");
		   p3.getAge(13);
		   p3.getStatus("Student-Balwyn School");
		   p3.getImage("phalange.jpeg");
		   p3.getfriend1("Ross Geller");
		   p3.getFriend2("Rachel Greene");
		   Profile p4=new Profile("Rachel Greene");
		   p4.getAge(11);
		   p4.getStatus("Student-Ringwood School");
		   p4.getImage("gucci.png");
		   p4.getfriend1("Phoebe Buffay");
		   p4.getFriend2("Ross Geller");
		   Profile p5=new Profile("Ross Geller");
		   p5.getAge(35);
		   p5.getStatus("Student-Camberwell School");
		   p5.getImage("paleantology.png");
		   p5.getfriend1("Chandler Bing");
		   p5.getFriend2("Joey Tribbiani");
		   Profile p6=new Profile("Monica Geller");
		   p6.getAge(40);
		   p6.getStatus("Chef at Nandos");
		   p6.getImage("harmonica.png");
		   p6.getfriend1("Chandler Bing");
		   p6.getFriend2("Joey Tribbiani");
           addProfile person= new addProfile();//object creation addProfile
		   Profile prof=new Profile("Chandler");//object creation Profile
           selectProfile sel=new selectProfile();//object creation selectProfile
           Connect con=new Connect();//object creation Connect
		   System.out.println("MiniNet Menu");//Menu at startup
		   System.out.println("!================!");
		   System.out.println("1.Add a new profile");
		   System.out.println("2.Display every profile");
		   System.out.println("3.Make a selection");
		   System.out.println("4.Are they direct friends?");
		   System.out.println("5.Update the profile information");
		   System.out.println("6.Delete the profile");
		   System.out.println("7.Make a new connection");
		   System.out.println("8.List the parents");
           System.out.println("Enter your choice");
           Scanner sc= new Scanner(System.in);//input for switch
           int choice= sc.nextInt();
           switch(choice) { //switch case statement
           case 1:
        	   System.out.println("Add a new profile");
        	   person.addPers();//call to the method using the obj created
        	   break;
           case 2:
        	   System.out.println("Display every profile");
        	   p1.displayProfile();//call to displayProfile method
        	   p2.displayProfile();
        	   p3.displayProfile();
        	   p4.displayProfile();
        	   p5.displayProfile();
        	   p6.displayProfile();
        	   break;
           case 3:
        	   System.out.println("select a profile");
        	   sel.selection();//call to the method selection
        	   break;
           case 4:
        	   System.out.println("Friendship connections");
        	   break;
           case 5:
        	   System.out.println("Update the profile");
        	   break;
           case 6:
        	   System.out.println("Delete the profile!");
        	   prof.deleteProfile();//call to the deleteProfile
        	   break;
           case 7:
        	   System.out.println("New connection");
        	   con.connection();
        	   break;
           case 8:
        	   System.out.println("List of parents");
        	   break;
        }
		sc.close();//scanner close 
     	}
}