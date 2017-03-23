import java.util.ArrayList;
import java.util.Arrays;
public class Toyota extends Car 
{
	private double xcoord;
	private double ycoord;
	
    public Toyota(String p) 
	{
        super();
        ArrayList<String> position = new ArrayList<>(Arrays.asList(p.split(", ")));
        Double px = Double.parseDouble(position.get(0));
		Double py = Double.parseDouble(position.get(1));
        move(px, py);
    }
	
}