import java.util.Scanner;
public class Center
{
	static String first;
	static String second;
	static String third;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your first word: ");
		first = kb.next();
		System.out.println("Please enter your second word: ");
		second = kb.next();
		System.out.println("Please enter your third word: ");
		third = kb.next();
		System.out.println(makeCenter(first));
		System.out.println(makeCenter(second));
		System.out.println(makeCenter(third));
	}
	
	public static String makeCenter(String word)
	{
		if(word.length() >= 20)
		{
			return word;
		}
		else
			return makeCenter(" " + word + " ");
		
	}
}