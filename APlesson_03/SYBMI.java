import java.util.Scanner; //import Statement

public class SYBMI
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		
		System.out.println("How tall are you, in inches? ");
		
		int height = keyboard.nextInt();
		
		System.out.println("Okay! So, you're " + height + " inches tall. ");
		System.out.println("How much do you weigh, in pounds? ");
		
		int weight = keyboard.nextInt();
		
		//prompt for user input
		
		System.out.println("Okay! So, you're " + height + " inches tall and weigh " + weight + " pounds. "); 
		System.out.println("Let me calculate your BMI. ");
		
		int BMI = ((weight*703)/(height*height));
		
		System.out.println("Your BMI is " + BMI + ". ");
		
		
		
		
		
		
	}
}