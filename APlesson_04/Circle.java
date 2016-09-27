import java.util.Scanner;
public class Circle
{
	static double area;
	static double r;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the radius of the circle:");
		r = kb.nextDouble();
		calcArea();
		print();
	}
	
	public static void calcArea()
	{
		area = 3.14*(Math.pow(r, 2));
	}
	
	public static void print()
	{
		System.out.printf("The area of a circle with a radius of " + r + " is %5.5f .", area);
	}
}