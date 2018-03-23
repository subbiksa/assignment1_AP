package Mininet;

public class Adult extends Profile //inheritance
{ //class to show who are the adults in the network and list the parents
	//author Richa
	int minAge=16;
	
	public void isAdult(Profile p1, Profile p2, Profile p3, Profile p4, Profile p5, Profile p6)
	{
		if(p1.getAge(30)>minAge)
			System.out.println("Adult");
		if(p2.getAge(32)>minAge)
			System.out.println("Adult");
		if(p3.getAge(13)>minAge)
			System.out.println("Adult");
		if(p4.getAge(11)>minAge)
			System.out.println("Adult");
		if(p5.getAge(35)>minAge)
			System.out.println("Adult");
		if(p6.getAge(40)>minAge)
			System.out.println("Adult");
	}
	public void Parent(Profile p1, Profile p2, Profile p5, Profile p6)
	{
		String s1= "Bing";
		if(p1.getName("Chandler Bing").toLowerCase().indexOf(s1.toLowerCase()) != -1)
		{
			System.out.println("Parent of Phoebe Bing");
            System.out.println("Chandler Bing");
		}
		if(p2.getName("Joey Bing").toLowerCase().indexOf(s1.toLowerCase()) != -1)
		{
			System.out.println("Parent of Phoebe Bing");
			System.out.println("Joey Bing");
		}
		if(p5.getName("Ross Geller").toLowerCase().indexOf(s1.toLowerCase()) != -1)
		{
			System.out.println("Parent of Phoebe Bing");
			System.out.println("Ross Geller");
		}
		if(p6.getName("Monica Geller").toLowerCase().indexOf(s1.toLowerCase()) != -1)
		{
			System.out.println("Parent of Phoebe Bing");
			System.out.println("Monica Geller");
		}
		String s2 = "Geller";
		if(p1.getName("Chandler Bing").toLowerCase().indexOf(s2.toLowerCase()) != -1)
		{
			System.out.println("Parent of Rachel Geller");
            System.out.println("Chandler Bing");
		}
		if(p2.getName("Joey Bing").toLowerCase().indexOf(s2.toLowerCase()) != -1)
		{
			System.out.println("Parent of Rachel Geller");
			System.out.println("Joey Bing");
		}
		if(p5.getName("Ross Geller").toLowerCase().indexOf(s2.toLowerCase()) != -1)
		{
			System.out.println("Parent of Rachel Geller");
			System.out.println("Ross Geller");
		}
		if(p6.getName("Monica Geller").toLowerCase().indexOf(s2.toLowerCase()) != -1)
		{
			System.out.println("Parent of Rachel Geller");
			System.out.println("Monica Geller");
		}
	}
}

