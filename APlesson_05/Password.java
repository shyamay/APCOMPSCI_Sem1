import java.util.Scanner;
public class Password
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		passCheck();
	}
	public static void passCheck()
	{
		String pass = "tphs*325!";
		String user = "tp_student";
		System.out.println("Please enter the password: ");
		String guess1 = kb.next();
		System.out.println("Please enter the username: ");
		String guess2 = kb.next();
		
		if(guess1.equals (pass) && guess2.equals(user))
		{
			System.out.println("You are granted access!");
		}
		else
		{
			if(!guess1.equals (pass) && guess2.equals(user))
				System.out.println("Your password is incorrect!");
			else if(guess1.equals (pass) && !guess2.equals(user))
				System.out.println("Your username is incorrect!");
			else
				System.out.println("Your username and password are incorrect!");
		}
	}
}