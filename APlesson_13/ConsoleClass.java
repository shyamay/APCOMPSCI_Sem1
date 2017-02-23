public abstract class ConsoleClass extends GameSystems_Class
{
	private String controller;
	
	public ConsoleClass()
	{
		super();
	}
	
	public ConsoleClass(String c)
	{
		super(c);
	}
	
	public abstract String getController();
	
	public String toString()
	{
		return "Platform: " + getPlatform() + "\nSerial #: " + getSerialNo() + "\nController : " + getController();
	}
	
}