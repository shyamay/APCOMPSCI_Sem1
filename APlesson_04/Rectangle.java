import java.util.Scanner;
public class Rectangle
{
	static double perimeter;
	static double length;
	static double width;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the length of the rectangle:");
		length = kb.nextDouble();
		System.out.println("Please enter the width of the rectangle:");
		width = kb.nextDouble();
		method1();
		method2();
	}
	
	public static void method1()
	{
		perimeter = 2*(length + width);
	}
	
	public static void method2()
	{
		System.out.printf("Your rectangle is %.5f ft around.", perimeter);
	}
}