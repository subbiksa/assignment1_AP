package Mininet;

import java.util.Scanner;

//author Subbiksa

class selectProfile {

		public selectProfile() {
		
	}
	public void selection() {
		   System.out.println("The profiles on the social network-MININET");//display profiles
	       System.out.println("1.Chandler Bing");
     	   System.out.println("2.Joey Tribbiani");
		   System.out.println("3.Phoebe Buffay");
		   System.out.println("4.Rachel Greene");
		   System.out.println("5.Ross Geller");
		   System.out.println("6.Monica Geller");
		   System.out.println("Enter your choice");
		   Scanner sc=new Scanner(System.in);
		   int choice=sc.nextInt();//enter your choice to select
		   switch(choice) {
		   case 1:
        	   System.out.println("Chandler Bing,30,Advertising Head-Schwarzkorf,chanman.jpeg,Friends:Monica Geller,Joey Tribbiani");
        	   break;
		   case 2:
			   System.out.println("Joey Tribbiani,32,Actor-Days Of our Lives,drakeramoray.png,Friends:Chandler Bing,Rachel Greene");
        	   break;
		   case 3:
			   System.out.println("Phoebe Buffay,13,Student-Balwyn School,phalange.jpg,Friends:Ross Geller,Rachel Greene");
        	   break;
		   case 4:
			   System.out.println("Rachel Greene,11,Student-Ringwood School,gucci.png,Friends:Phoebe Buffay,Ross Geller");
	           break;
		   case 5:
			   System.out.println("Ross Geller,35,Student-Camberwell School,paleontology.png,Friends:Chandler Bing,Joey Tribbiani");
	        	break;
		   case 6:
			   System.out.println("Monica Geller,40,Chef at Nandos,harmonica.png,Friends:Chandler Bing,Joey Tribbiani");
        }
           sc.close();
	}

}