import java.util.Scanner;
public class First_Letter
{
	public static void main(String[]args)
	{
		String[] words = new String[5];
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter 5 words: ");
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		System.out.println(first(words));
	}
	
	public static String first(String[] words)
	{
		String firstlet = "";
		for(String word : words)
		{
			firstlet += word.substring(0,1) + " ";
		}
		return firstlet;
	}
}