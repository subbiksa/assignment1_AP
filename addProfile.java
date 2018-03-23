package Mininet;
import java.util.*;  

//author Subbiksa

 class addPerson {
    	String name;
		int age;
		String status;
		String image;
		String friend1;
		String friend2;//variable declaration
    	public addPerson(String name,int age, String status, String image, String friend1,String friend2) {  
	    this.name = name;  
	    this.age = age;  
	    this.status = status;  
	    this.image = image;  
	    this.friend1 = friend1;
	    this.friend2=friend2;//constructor for addPerson
    	}  
	}  
	public class addProfile {  
	public void addPers() {  
	    //Creating list   
	    List<addPerson> list=new ArrayList<addPerson>();  
	    //Creating Profiles  
	   //add already created profile
	    addPerson adPers=new addPerson("Joey Tribbiani",32,"Actor-days of our lives","drakeramoray.png","Chandler Bing","Rachel Greene");  
	    //Adding Profiles to list  
	    list.add(adPers);  
	    //Traversing list of profiles  
	    for(addPerson b:list){  
	    System.out.println(b.name+" "+b.age+" "+b.status+" "+b.image+" "+b.friend1+""+b.friend2);  
	    }  
	    
	}  
	
}  


