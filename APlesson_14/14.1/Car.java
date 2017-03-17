public abstract class Car implements Location
{
	private final int ID = (int)(Math.random() * 1000000) + 1;
	public double[] location;
	
	public Car()
	{
		location = new double[2];
	}
	
	public void move(double x, double y)
	{
		location[0] = x;
		location[1] = y;
	}
	
	public double[] getLoc()
	{
		return location;
	}
	
	public int getID()
	{
		return ID;
	}
}