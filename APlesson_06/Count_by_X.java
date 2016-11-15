import java.util.Scanner;
public class Count_by_X
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the last integer: ");
		int last = kb.nextInt();
		System.out.println("Please enter the first integer: ");
		int first = kb.nextInt();
		
		for(int i = first; i <= last; i+=2)
		{
			System.out.print(i + " ");
		}
	}
}