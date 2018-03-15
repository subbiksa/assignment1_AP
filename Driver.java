package Mininet;
import java.util.Scanner;
public class Driver {
	public static void main(String args[]) {
		   Profile p1= new Profile("Chandler Bing");
		   p1.getAge(30); p1.getStatus("Advertising Head-Schwarzkorf");
		   p1.getImage("chanman.jpeg");p1.getfriend1("Monica Geller");p1.getFriend2("Joey Tribbiani");
		  // p1.displayProfile();
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
        	   break;
           case 2:
        	   System.out.println("Display profile");
        	   p1.displayProfile();
        	   break;
           case 3:
        	   System.out.println("select a profile");
        	   break;
           case 4:
        	   System.out.println("Friendship connections");
        	   break;
           case 5:
        	   System.out.println("Update the profile");
        	   break;
           case 6:
        	   System.out.println("Delete the profile");
        	   break;
           case 7:
        	   System.out.println("Connect profiles");
        	   break;
           case 8:
        	   System.out.println("List of parents");
        	   break;
        }
		sc.close();
     	}
	}