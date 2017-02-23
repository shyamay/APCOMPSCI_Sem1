public class StudentAdvance_Class extends AdvanceClass
{
	
	public StudentAdvance_Class()
	{
		super();
	}
	
	public int getPrice()
	{
		return super.getPrice()/2;
	}
	
	public String toString()
	{
		return "Serial #: " + getSerialNo() + "\nPrice: " + getPrice() + "\n(STUDENT ID REQUIRED)";
	}
}