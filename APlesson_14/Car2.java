public abstract class Car2 implements Location2
{
	private int ID;
	
	public Car2()
	{
		ID = (int)(Math.random() * 1000000) + 1;
	}
	
	public abstract void move(double xcoordinate, double ycoordinate);
	
	public int getID()
	{
		return ID;
	}
}