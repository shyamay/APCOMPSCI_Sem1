import java.util.Scanner;
public class Underscores
{
	static String sentence;
	static int top = 0;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		sentence = kb.nextLine();
		replace();
	}
	
	public static void replace()
	{
		while(sentence.indexOf(" ") >= 0)
		{
			sentence = sentence.substring(0, sentence.indexOf(" ")) + "_" + sentence.substring(sentence.indexOf(" ") + 1);
		}
	
		System.out.println("Without spaces... " + sentence);
	}
		
}