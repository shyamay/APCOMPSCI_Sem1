import java.util.Scanner; //import Statement

public class SYReceipt
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//instantiate a new SYReceipt object
		SYReceipt receipt = new SYReceipt();
		
		//prompt for user input
		System.out.println("Please enter item 1: ");
		String first = keyboard.nextLine();
		System.out.println("Please enter the price: ");
		double price1 = keyboard.nextDouble();
		keyboard.nextLine();
		
		//prompt for user input
		System.out.println("Please enter item 2: ");
		String second = keyboard.nextLine();
		//prompt for user input
		System.out.println("Please enter the price: ");
		double price2 = keyboard.nextDouble();
		keyboard.nextLine();
		
		//prompt for user input
		System.out.println("Please enter item 3: ");
		String third = keyboard.nextLine();
		//prompt for user input
		System.out.println("Please enter the price: ");
		double price3 = keyboard.nextDouble();
		
/* 		String first = "Cheese Sandwich";
		double price1 = 4.50;
		
		String second = "French Fries";
		double price2 = 2.88;
	
		String third = "Soda";
		double price3 = 1.63; */
		
		String word1 = "Subtotal:";
		double subtotal = price1+price2+price3;
		
		String word2 = "Tax:";
		double tax = 1.25;
		
		String word3 = "Total:";
		double total = subtotal+tax;
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		
		receipt.format(first, price1);
		receipt.format(second, price2);
		receipt.format(third, price3);
		
		System.out.println("\n");
		
		receipt.format(word1, subtotal);
		receipt.format(word2, tax);
		receipt.format(word3, total);
		
		System.out.println("\n__________________________________________\n* Thank you for your support *");
	}
	
	public void format(String word, double number)
	{
		System.out.printf("\n* %15s........%10.2f", word, number);
	}

}