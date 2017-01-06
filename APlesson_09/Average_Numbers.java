import java.util.Scanner;
public class Average_Numbers
{
	public static void main(String[]args)
	{
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
		
		System.out.println("Numbers...");
		
		for(int num : numbers)
			System.out.println(num);
		System.out.println("\"" + numbers + "\", ");
		System.out.println("The average of the above numbers above is..." + average(numbers));
	}
	
	public static int average(int[] nums)
	{
		int avg = 0;
		for(int num : nums)
		{
			avg += num;
		}
		return avg/nums.length;
	}
}