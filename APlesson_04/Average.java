import java.util.Scanner;
public class Average
{
	static double average;
	static double num1;
	static double num2;
	static double num3;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an integer:");
		num1 = kb.nextDouble();
		System.out.println("Please enter an integer:");
		num2 = kb.nextDouble();
		System.out.println("Please enter an integer:");
		num3 = kb.nextDouble();
		average();
		print();
	}
	
	public static void average()
	{
		average = (num1+num2+num3)/3;
	}
	
	public static void print()
	{
		System.out.printf("The average of " + num1 + ", " + num2 + ", " + "and " + num3 + " is %5.5f .", average);
	}
}