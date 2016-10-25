import java.util.Scanner;
import java.util.Random;
public class Dice_Roll
{
	static int player;
	static int computer;
	
	public static void main(String[]args)
	{
		Random rand = new Random();
		player = rand.nextInt(7);
		System.out.println("You rolled a " + player + ". ");
		computer = rand.nextInt(7);
		System.out.println("The computer rolled a " + computer + ". ");
		DiceRoll();
		
	}
	
	public static void DiceRoll()
	{	
		if(player > computer)
			System.out.println("The winner is you! ");
		
		if(computer > player)
			System.out.println("The winner is the computer!");
		
		else 
			System.out.println("It is a tie! ");
		}
}