public class Honda extends Car 
{
    private double xcoord;
	private double ycoord;
	
    public Honda(double[] p) 
	{
        super();
        move(p[0], p[1]);
    }
}