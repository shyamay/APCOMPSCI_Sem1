import java.util.Scanner;
public class Strings
{
	public static void main(String[]args)
	{
		String[][] words = new String [4][4];
		Scanner kb = new Scanner(System.in);
		
		for(int i = 0; i < words.length; i++)
		{
			for(int j = 0; j < words[i].length; j++)
			{
				System.out.print("Please enter a word: ");
				words[i][j] = kb.next();
			}
		}
		
		for(int i = 0; i < words.length; i++)
		{
			for(int j = 0; j < words[i].length; j++)
			{
				System.out.print(words[i][j] + "\t");
			}
			System.out.println();
		}
	}
}