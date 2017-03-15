public class Honda2 extends Car2 
{
    private double xmove, ymove;
	
    public Honda2(double[] Po) 
	{
        super();
        move(Po[0], Po[1]);
    }
    public void move(double x, double y) 
	{
        this.xmove += x;
        this.ymove += y;
    }
    public double[] getLoc() 
	{
        double[] location = {xmove, ymove};
        return location;
    }
}