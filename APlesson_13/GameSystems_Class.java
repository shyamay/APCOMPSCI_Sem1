public class GameSystems_Class
{
	private String platform;
	private int serialNo;
	
	public GameSystems_Class()
	{
		this.platform = "";
		this.serialNo = 0;
	}
	
	public GameSystems_Class(String p)
	{
		this.platform = p;
		this.serialNo = (int)(Math.random() * 10000000) + 1;
	}
	
	public String getPlatform()
	{
		return platform;
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
}