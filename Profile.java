 package Mininet;

import java.util.ArrayList;
//author Subbiksa
public class Profile {//creation of new class Profile

	 String name;//variable declared for each profile
	 int age;
	 String status;
	 String image;
	 String friend1;
	 String friend2; String friend3;
	public String getName(String profileName) {  
		name = profileName;
		return name;
	}
	public int getAge(int profileAge) {//assigning age 
		age= profileAge;
		return age;
	}
	public void getStatus(String profileStatus) {//assign status
		status= profileStatus;
	}
	public void getImage(String profileImage) {//assign image
		image= profileImage;
	}
	public void getFriend1(String profileFriend1) {//assign friend1
		friend1= profileFriend1;
	}
	public void getFriend2(String profileFriend2) {//assign friend2
		friend2= profileFriend2;
	}
	public void getFriend3(String profileFriend3) {//assign friend3
		friend3 = profileFriend3;
	}
	public void displayProfile() {//print the details of the profile
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Status:"+status);
		System.out.println("Image:"+image);
		System.out.println("List of Friends:"+friend1+"\n"+friend2+"\n"+ friend3);
		
	}
	public void deleteProfile() {
    	ArrayList<String> lis = new ArrayList<String>(5);
    	lis.add("Chandler Bing");
    	lis.add("Joey Tribbiani");
    	lis.add("Phoebe Buffay");
    	lis.add("Rachel Greene");
    	lis.add("Monica Geller");
    	System.out.println("List of Profiles");
    	for(String value:lis) {
    		System.out.println(" "+value);
    	}
    	lis.remove(0);
    	System.out.println("New profile list");
    	for(String value:lis) {
    		System.out.println(" "+value);
}
	}
    	

}
