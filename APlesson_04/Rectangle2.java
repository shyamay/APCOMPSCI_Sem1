import java.util.Scanner;
public class Rectangle2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the length: ");
		int length = kb.nextInt();
		System.out.println("Enter the width: ");
		int width = kb.nextInt();
		print(calcPerim(length, width));
	}
	
	public static int calcPerim(int length, int width)
	{
		return 2*(length+width);
	}
	
	public static void print(double perimeter)
	{
		System.out.printf("The perimeter of your rectangle is %.5f cm.", perimeter);
	}
}