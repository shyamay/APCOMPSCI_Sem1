public class GMC2 extends Car2
{
    private double xmove, ymove;
	
    public GMC2(double x, double y) 
	{
        super();
        move(x, y);
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