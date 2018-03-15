package Mininet;

public class Profile {//creation of new class Profile

	 String profileName;//variable declared for each profile
	 int age;
	 String status;
	 String image;
	 String friend1;
	 String friend2;
	public Profile(String profileName) { //constructor of the class Profile 
		
		this.profileName=profileName;
	}
	public void getAge(int profileAge) {//assigning age 
		age= profileAge;
	}
	public void getStatus(String profileStatus) {//assign status
		status= profileStatus;
	}
	public void getImage(String profileImage) {//assign image
		image= profileImage;
	}
	public void getfriend1(String profileFriend1) {//assign friend1
		friend1= profileFriend1;
	}
	public void getFriend2(String profileFriend2) {//assign friend2
		friend2= profileFriend2;
	}
	public void displayProfile() {//print the details of the profile
		System.out.println("Name:"+profileName);
		System.out.println("Age:"+age);
		System.out.println("Status:"+status);
		System.out.println("Image:"+image);
		System.out.println("List of Friends:"+friend1+"\n"+friend2);
		
	}
	
}
