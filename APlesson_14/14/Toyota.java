public class Toyota implements Location
{
	private double[] location;
	private double xcoordinate;
	private double ycoordinate;
	
	public Toyota()
	{
		location = new double[2];
	}
	
	public Toyota(String c)
	{
		xcoordinate = Double.parseDouble(c.substring(0,1));
		ycoordinate = Double.parseDouble(c.substring(3));
	}
	
	public int getID()
	{
		return (int) (Math.random() * 1000000) + 1;
	}
	
	public void move(double x, double y)
	{
		xcoordinate = x;
		ycoordinate = y;
	}
	
	public double[] getLoc()
	{
		double [] location = {xcoordinate, ycoordinate};  
		return location;
	}
	
}