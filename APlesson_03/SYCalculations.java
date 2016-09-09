import java.util.Scanner; //import Statement

public class SYCalculations
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("What is the length of the rectangular prism, in inches? ");
		
		int length = keyboard.nextInt();
		
		System.out.println("Okay! So the length is " + length + " inches. ");
		System.out.println("What is the height of the rectangular prism, in inches? ");
		
		int height = keyboard.nextInt();
		
		//prompt for user input
		
		System.out.println("Alright. ");
		System.out.println("What is the width of the rectangular prism, in inches? ");
		
		int width = keyboard.nextInt();
		
		//prompt for user input
		
		System.out.println("Okay! So the length, height, and width of the rectangular prism are " + length + " inches, " + height + " inches, and " + width + " inches, respectively. " );
		System.out.println("Let me calculate the volume of this rectangular prism. ");
		
		int volume = length*height*width;
		
		System.out.println("The area of the rectangular prism is " + volume + " inches cubed. ");
		
	}
}