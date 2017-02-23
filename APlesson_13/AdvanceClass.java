public class AdvanceClass extends Ticket_Superclass
{
	private int daysLeft;
	
	public AdvanceClass()
	{
		super();
	}
	
	public AdvanceClass(int d)
	{
		super();
	}
	
	public int getPrice()
	{
		if(daysLeft >= 10)
		{
			return 30;
		}
		else
		{
			return 40;
		}
	}
}