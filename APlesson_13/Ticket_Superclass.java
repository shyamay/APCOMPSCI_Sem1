public abstract class Ticket_Superclass
{
	private int serialNo;
	
	public Ticket_Superclass()
	{
		this.serialNo = 0;
	}
	
	public int getSerialNo()
	{
		return (int)(Math.random() * 10000000) + 1;
	}
	
	public abstract int getPrice();
	
	public String toString()
	{
		return "Serial #: " + getSerialNo() + "\nPrice: " + getPrice();
	}
	
	
}