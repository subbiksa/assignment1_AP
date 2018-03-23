package Mininet;//common package
import java.util.Scanner;
public class Driver {

	//author Richa
	
	       public static void main(String args[]) {
		   Profile p0= new addProfile();//object creation to add a new profile to the network
		   Profile p1 = new Profile();
		   p1.getName("Chandler Bing");
		   p1.getAge(30); 
		   p1.getStatus("Advertising Head-Schwarzkorf");
		   p1.getImage("chanman.jpeg");
		   p1.getFriend1("Phoebe Bing");
		   p1.getFriend2("Monica Geller");
		   p1.getFriend3("Joey Tribbiani");
		   Profile p2=new Profile();
		   p2.getName("Joey Bing");
		   p2.getAge(32);
		   p2.getStatus("Actor-Days Of our Lives");
		   p2.getImage("drakeramoray.png");
		   p2.getFriend1("Chandler Bing");
		   p2.getFriend2("Phoebe Bing");
		   p2.getFriend3("Ross Geller");
		   Profile p3=new Profile();
		   p3.getName("Phoebe Bing");
		   p3.getAge(13);
		   p3.getStatus("Student-Balwyn School");
		   p3.getImage("phalange.jpeg");
		   p3.getFriend1("Chandler Bing");
		   p3.getFriend2("Joey Bing");
		   p3.getFriend3("Rachel Geller");
		   Profile p4=new Profile();
		   p4.getName("Rachel Geller");
		   p4.getAge(11);
		   p4.getStatus("Student-Ringwood School");
		   p4.getImage("gucci.png");
		   p4.getFriend1("Phoebe Bing");
		   p4.getFriend2("Ross Geller");
		   p4.getFriend3("Monica Geller");
		   Profile p5=new Profile();
		   p5.getName("Ross Geller");
		   p5.getAge(35);
		   p5.getStatus("Student-Camberwell School");
		   p5.getImage("paleantology.png");
		   p5.getFriend1("Rachel Geller");
		   p5.getFriend2("Chandler Bing");
		   p5.getFriend3("Joey Bing");
		   
		   Profile p6=new Profile();
		   p6.getName("Monica Geller");
		   p6.getAge(40);
		   p6.getStatus("Chef at Nandos");
		   p6.getImage("harmonica.png");
		   p6.getFriend1("Rachel Geller");
		   p6.getFriend2("Chandler Bing");
		   p6.getFriend3("Joey Bing");
		   
		   Profile P = new Profile();// object creation for class Profile
		   /* can be used to display the dependents in the network
		    Profile d = new Dependent();// object creation for calling functions of class Dependent
		   ((Dependent)d).isDependent(p1,p2,p3,p4,p5,p6);//polymorphism
		   ((Dependent)d).isFriend(p3,p4);
		   */
		   
		   Profile a = new Adult();//object creation for calling functions of class Adult, which tells who is an adult and displays the parents in the network 
		   selectProfile sp = new selectProfile();
		   
		   Connect con= new Connect();// object creation to access functions of class Connect, which is used to connect two persons and to check direct/indirect connections
		   
		   
		 
		   System.out.println("MiniNet Menu");
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
           Scanner sc= new Scanner(System.in);
           int choice= sc.nextInt();
           switch(choice) {
           case 1:
        	   System.out.println("Add a new profile");
        	   ((addProfile) p0).addPers(); //polymorphism
        	   break;
           case 2:
        	   System.out.println("Display every profile");
        	   p1.displayProfile();
        	   p2.displayProfile();
        	   p3.displayProfile();
        	   p4.displayProfile();
        	   p5.displayProfile();
        	   p6.displayProfile();
        	   break;
           case 3:
        	   System.out.println("select a profile");
        	   sp.selection();
        	   break;
           case 4:
        	   System.out.println("Friendship connections");
        	   break;
 case 5:
        	   System.out.println("Update the profile------");
        	   
        	   P.updateProfile(p1);
               break;
           case 6:
        	   System.out.println("Delete the profile");
        	   P.deleteProfile();
        	   break;
           case 7:
        	   System.out.println("Connect profiles");
        	   con.connection(p1, p6);
        	   break;
           case 8:
        	   System.out.println("List of parents");
        	   ((Adult)a).Parent(p1, p2, p5, p6);//polymorphism
        	   
        	   
        	   break;
        }
		sc.close();
     	}
}