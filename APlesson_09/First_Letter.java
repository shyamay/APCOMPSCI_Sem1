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
		
		for(String word : words)
		{
			System.out.println(word);
			System.out.println("\"" + word + "\", ");
		}
		
		first(words);
	}
	public static void first(String[] w)
	{
		for(int i = w.length + 1; i >= 0; i++)
		{
			System.out.println(w[i]);
		}
	}
}