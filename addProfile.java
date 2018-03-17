package Mininet;
import java.util.*;  

 class addPerson {
    	String name;
		int age;
		String status;
		String image;
		String friend1;
		String friend2;
    	public addPerson(String name,int age, String status, String image, String friend1,String friend2) {  
	    this.name = name;  
	    this.age = age;  
	    this.status = status;  
	    this.image = image;  
	    this.friend1 = friend1;
	    this.friend2=friend2;
	}  
	}  
	public class addProfile {  
	public void addPers() {  
	    //Creating list   
	    List<addPerson> list=new ArrayList<addPerson>();  
	    //Creating Profiles  
	    addPerson b1=new addPerson("Gunther",40,"Barista-Central Perk","gunth.png","Janice","Rachel Greene");  
	    addPerson b2=new addPerson("Janice",56,"Entrpreneur","jan.png","Gunther","Rachel Greene");  
	    //Adding Profiles to list  
	    list.add(b1);  
	    list.add(b2);  
	    //Traversing list of profiles  
	    for(addPerson b:list){  
	    System.out.println(b.name+" "+b.age+" "+b.status+" "+b.image+" "+b.friend1+""+b.friend2);  
	    }  
	}  
	}  


