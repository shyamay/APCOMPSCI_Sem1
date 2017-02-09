public class UserNames (11:53 on the video-- create new java document)
{
	private String userName, firstName, lastName;
	public UserNames()
	{
		userName = "";
		firstName = "";
		lastName = "";
	}
	
	public UserNames(String uName, String fName, String lName)
	{
		userName = uName;
		firstName = fName;
		lastName = lName;
	}
	
	public void setUserName(String uName)
	{
		userName = uName;
	}
	
	public String getUserName()
	{
		return userName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public static void main(String[]args)
	{
		UserNames object = new UserNames("proHndsm", "Professor", "Handsome");
		System.out.println("<<<<<<<<< USER INFO >>>>>>>>>>>>>>>>>");
		System.out.println("Name: " + object.getFirstName() + " " + object.getLastName());
		System.out.println("User Name: " + object.getUserName());
	}
}