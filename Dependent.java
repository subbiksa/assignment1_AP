package Mininet;
import java.lang.Math;
public class Dependent extends Profile //inheritance 
{ //class to show who all are dependents in the network and display if they can be friends with each other or not
	
	//author Richa
	
	int minAge=16;
	public void isDependent(Profile p1, Profile p2, Profile p3, Profile p4, Profile p5, Profile p6)
	{
		if(p1.getAge(30)<minAge) {
				System.out.println("Dependent");
				p1.displayProfile();
		}
		if(p2.getAge(32)<minAge) {
			System.out.println("Dependent");
		p2.displayProfile();
}
		
		if(p3.getAge(13)<minAge) {
			System.out.println("Dependent");
		p3.displayProfile();
		}
		
		if(p4.getAge(11)<minAge) {
			System.out.println("Dependent");
		p4.displayProfile();
		}
			
		if(p5.getAge(35)<minAge) {
			System.out.println("Dependent");
		p5.displayProfile();
		}
		
		if(p6.getAge(40)<minAge) {
			System.out.println("Dependent");
		p6.displayProfile();
		}

	}
		public void isFriend(Profile p3, Profile p4) {
			// TODO Auto-generated method stub
			int ageDiff	= 3;
			if(p3.getAge(13)-p4.getAge(11)<= Math.abs(ageDiff))
			System.out.println(p3.getName("Phoebe Buffay") + " and " + p4.getName("Rachel Greene") + " are friends");
	    		
	    		   
		}
       }


