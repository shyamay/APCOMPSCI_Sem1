import java.util.Scanner;
public class Average2
{	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int num1 = kb.nextInt();
		System.out.println("Please enter an integer: ");
		int num2 = kb.nextInt();
		System.out.println("Please enter an integer: ");
		int num3 = kb.nextInt();
		print("The average of " + num1 + ", " + num2 + ", and " + num3 + " is ", average(num1, num2, num3));
	}
	
	public static int average(int num1, int num2, int num3)
	{
		return (num1+num2+num3)/3;
	}
	
	public static void print(String text, double average)
	{
		System.out.printf(text + "%.5f cm.", average);
	}
}