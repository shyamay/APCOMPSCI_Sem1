public class PC_Class extends GameSystems_Class
{
	public PC_Class()
	{
		super();
	}
	
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	
	public PC_Class(String c)
	{
		super(c);
	}
	
	public String toString()
	{
		return "Platform: " + getPlatform() + "\nSerial #: " + getSerialNo() + "\nSystem Input : " + systemInput();
	}
}