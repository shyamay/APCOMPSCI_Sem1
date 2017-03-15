import java.util.*;

public class Toyota2 extends Car2 
{
    private double xmove, ymove;
	
    public Toyota2(String Po) 
	{
        super();
        ArrayList<String> position = new ArrayList<>(Arrays.asList(Po.split(", ")));
        Double PoX = Double.parseDouble(position.get(0)), PoY = Double.parseDouble(position.get(1));
        move(PoX, PoY);
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