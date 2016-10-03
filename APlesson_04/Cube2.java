import java.util.Scanner;
public class Cube2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the side of the cube: ");
		double side = kb.nextDouble();
		print("The surface area of a cube whose sides are " + side + " cm in length is ", calcSurf(side));
	}
	
	public static double calcSurf(double side)
	{
		return 6*(Math.pow(side, 2));
	}
	
	public static void print(String text, double surfArea)
	{
		System.out.printf(text + "%.5f squared cm.", surfArea);
	}
}