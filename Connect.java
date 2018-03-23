package Mininet;

import java.util.Scanner;
//author Richa
public class Connect {// to connect two members as friends 
	
	String sName;
	String OK;
	String YES;
	Scanner in = new Scanner(System.in);

	public void connection(Profile p1, Profile p6) {
		System.out.println("Welcome to your profile \t"+p1.getName("Chandler Bing"));
		System.out.println("Enter the name of the person you want to connect to");
		sName= in.nextLine();
		System.out.println("Type ENTER to view the profile");
		OK = in.nextLine();
		p6.displayProfile();
		System.out.println("Add Friend");
		System.out.println("Press ENTER to add friend");
		OK = in.nextLine();
		System.out.println("Request sent");
		
		System.out.println("Welcome to your profile \t"+ p6.getName("Monica Geller") );
		System.out.println("View Friend Requests \nPress ENTER to see");
		OK = in.nextLine();
		System.out.println("Chandler Bing");
		System.out.println("Press YES to Accept \t \t Press NO to Decline");
		YES = in.nextLine();
		System.out.println("Friends!");
		}
	public void directIndirect(Profile p2, Profile p3) { //to show whether a direct or indirect connection exist between two people
	
    
	}
}