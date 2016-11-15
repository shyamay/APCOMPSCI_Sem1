import java.util.Scanner;
public class Graph_Table
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please answer an integer: ");
		int number = kb.nextInt();
		System.out.println("Please enter the size of the table: ");
		int size = kb.nextInt();
		
		for(int i = 1; i <= size; i++)
		{
			System.out.printf("%10s | %10s\n", i, i* number);
		}
	}
}