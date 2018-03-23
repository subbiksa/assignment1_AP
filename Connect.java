package Mininet;

import java.util.Scanner;

public class Connect {

	public void connection() {
		
  		 String profileName;//variable declared for each profile
		 String age;
		 String status;
		 String image;//variable declaration
         Scanner in= new Scanner(System.in); 
         System.out.println("Welcome to MININET!");
         System.out.println("Enter your details to get started!");
         System.out.println("Profile Name");//enter the profile details
         profileName=in.nextLine();
         System.out.println("Age");
         age=in.nextLine();
         System.out.println("Status");
         status=in.nextLine();
         System.out.println("image");
         image=in.nextLine();
         System.out.println("Profile Name:\t"+profileName);//display the details
         System.out.println("Age:\t"+age);
         System.out.println("status:\t"+status);
         System.out.println("image:\t"+image);
         in.close();
         }
	}
	