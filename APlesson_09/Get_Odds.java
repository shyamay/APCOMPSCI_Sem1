import java.util.Scanner;
public class Get_Odds
{
	static int[] odds;
	public static void main(String[]args)
	{
		odds = new int[10];
		fillArray();
		System.out.println("For the following numbers...");
		printArray(odds);
		System.out.println("\nThe numbers " + getOdds(odds) + "are odd numbers");
	}
	
	public static void fillArray()
	{
		for(int i = 0; i < odds.length; i++)
		{
			odds[i] = (int)(Math.random() * 100) + 1;
		}
	}
	
	public static void printArray(int[] odds)
	{
		for(int i = 0; i < odds.length; i++)
		{
			System.out.print(odds[i] + " ");
		}
	}
	public static String getOdds(int [] odds)
	{
		String oddNumbers = " ";
		for(int odd : odds)
		{
			if(odd%2 == 1)
			{
			oddNumbers += odd + " ";
			}
		}
		return oddNumbers;
	}
}