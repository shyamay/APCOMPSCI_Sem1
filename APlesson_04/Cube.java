import java.util.Scanner;
public class Cube
{
	static double sa;
	static double side;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the side of the cube:");
		side = kb.nextDouble();
		calcSurf();
		print();
	}
	
	public static void calcSurf()
	{
		sa = 6*(Math.pow(side, 2));
	}
	
	public static void print()
	{
		System.out.printf("The surface area of a cube with " + side + " sides is %5.5f .", sa);
	}
}