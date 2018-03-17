package Mininet;

public class UpdateProfile{
     int uAge;
     String uName;
     String uStatus, uImage;
  
	/*public UpdateProfile(String profileName, String uName, int uAge, String uStatus, String uImage)
	{
    super(profileName);
	}*/
	public void setUname(String updatedName)
	{
	    uName= updatedName;
	}
	public String getuName()
	{
		return uName;
	}
	public void setUage(int updatedAge) {
	
		uAge= updatedAge;
}
	public int getuAge() {
		return uAge;
	}
	public void setUstatus(String updatedStatus)
	{
		uStatus= updatedStatus;
	}
	public String getUstatus()
	{
		return uStatus;
	}
	public void setUimage(String updatedImage)
	{
		uImage= updatedImage;
	}
	public String getUimage()
	{
		return uImage;
	}
    public void updateProfile()
    {
    	System.out.println("Name:"+ uName);
    	System.out.println("Age:"+ uAge);
    	System.out.println("Status:"+ uStatus);
    	System.out.println("Image:"+ uImage);
    }
}
