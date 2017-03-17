public class Toyota extends Car
{
    public Toyota(String Po) 
	{
        String [] position = Po.split(", ");
        location[0] = Double.parseDouble(position[0]);
		location[1] = Double.parseDouble(position[1]);
    }
}