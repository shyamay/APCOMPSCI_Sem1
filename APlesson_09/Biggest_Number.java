import java.util.Scanner;
public class Biggest_Number
{
	static int [] number;
	public static void main(String[]args)
	{
		number = new int[10];
		fillArray();
		System.out.println("For the following numbers..." + number);
		printArray(number);
		System.out.println("The biggest number is " + getBiggest(number));
	}
	
	public static void fillArray()
	{
		for(int i = 0; i < number.length; i++)
		{
			number[i] = (int)(Math.random() * 100) + 1;
		}
	}
	
	public static void printArray(int [] number)
	{
		for(int num : number)
		{
			System.out.println(num);
		}
	}
	
	public static int getBiggest(int [] number)
	{
		int max = 0;
		for(int num : number)
		{
			if(num > max)
			{
				max = num;
			}
		}
		return max;
	}
}