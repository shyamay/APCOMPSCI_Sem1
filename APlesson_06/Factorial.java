import java.util.Scanner;
public class Factorial
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please answer a number: ");
		int number = kb.nextInt();
		int fac = 1;
		for(int i = 1; i <= number; i++)
		{
			fac = fac*i;
		}
		System.out.println(fac);
	}
}