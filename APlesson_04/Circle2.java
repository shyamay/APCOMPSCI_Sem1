import java.util.Scanner;
public class Circle2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the radius of the circle: ");
		double radius = kb.nextDouble();
		print("The area of a circle with a radius of " + radius + " is ", calcArea(radius));
	}
	
	public static double calcArea(double radius)
	{
		return 3.14*(Math.pow(radius, 2));
	}
	
	public static void print(String text, double area)
	{
		System.out.printf(text + "%.5f squared cm.", area);
	}
}