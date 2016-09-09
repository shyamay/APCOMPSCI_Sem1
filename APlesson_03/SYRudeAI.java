import java.util.Scanner; //import Statement

public class SYRudeAI
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hi, my name is RudeAI. I'd like to ask you a few questions. ");
		System.out.println("What is your name? ");
		
		String statement = keyboard.next();
		
		//prompt for user input
		
		System.out.println(statement + "?!!! " + " Why would anyone name a baby that? ");
		System.out.println("How old are you, " + statement + " ? ");
		
		int age = keyboard.nextInt();
		
		//prompt for user input
		
		System.out.println("Oooooo!!! " + age + " is getting up there. ");
		System.out.println("What do you do for fun, " + statement + " ? ");
		
		String action = keyboard.next();
		
		//prompt for user input
		
		System.out.println("I thought only nerds like to " + action + ". ");
		System.out.println("What kind of music do you like? ");
		
		String music = keyboard.next();
		
		//prompt for user input
		
		System.out.println("Boooo!!! I wouldn't wish the sound of " + music + " on my worst enemy. ");
		System.out.println("How many siblings do you have? ");
		
		int siblings = keyboard.nextInt();
		
		//prompt for user input
		
		System.out.println(siblings + "? Wow, I hope the rest of your family is better looking. ");
		System.out.println(" What do you want to be when you grow up? ");
		
		String job = keyboard.next();
		
		//prompt for user input
		
		System.out.println("I think you'd have to be smarter to be a " + job + ". ");
		System.out.println("So " + statement + ", you're " + age + "... ");
		System.out.println("You like to " + action + " and listen to " + music + "... ");
		System.out.println("Good luck becoming a " + job + ". ");
		System.out.println("I'm only kiddin' " + statement + ". ");
		
		
		
		
		
		
		
		
		
		
	}
}