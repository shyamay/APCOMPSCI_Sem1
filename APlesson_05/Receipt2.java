import java.util.Scanner; 

public class Receipt2
{
	public static void main(String[]args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		Receipt2 receipt = new Receipt2();
		System.out.println("Please enter item 1: ");
		String first = keyboard.nextLine();
		System.out.println("Please enter the price: ");
		double price1 = keyboard.nextDouble();
		keyboard.nextLine();
		System.out.println("Please enter item 2: ");
		String second = keyboard.nextLine();
		System.out.println("Please enter the price: ");
		double price2 = keyboard.nextDouble();
		keyboard.nextLine();
		System.out.println("Please enter item 3: ");
		String third = keyboard.nextLine();
		System.out.println("Please enter the price: ");
		double price3 = keyboard.nextDouble();
		keyboard.nextLine();
		System.out.println("Please enter item 4: ");
		String fourth = keyboard.nextLine();
		System.out.println("Please enter the price: ");
		double price4 = keyboard.nextDouble();
		
/* 		String first = "Cheese Sandwich";
		double price1 = 4.50;
		
		String second = "French Fries";
		double price2 = 2.88;
	
		String third = "Soda";
		double price3 = 1.63; 
		
		String fourth = "Hamburger";
		double price4 = 3.15; */
		
		String word1 = "Subtotal:";
		double subtotal = price1+price2+price3+price4;
		
		String word2 = "Discount: ";
		double discount = Discount(subtotal);
		
		String word3 = "Tax:";
		double tax = 18.50;
		
		String word4 = "Total:";
		double total = subtotal - discount + tax;
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		
		receipt.format(first, price1);
		receipt.format(second, price2);
		receipt.format(third, price3);
		receipt.format(fourth, price4);
		
		System.out.println("\n");
		
		receipt.format(word1, subtotal);
		receipt.format(word2, discount);
		receipt.format(word3, tax);
		receipt.format(word4, total);
		
		System.out.println("\n__________________________________________\n* Thank you for your support *");
	}
	
	public static double Discount(double subtotal)
	{
		if (subtotal >= 2000)
			return (0.15*subtotal);
		else
			return(0);
	}
	public void format(String word, double number)
	{
		System.out.printf("\n* %15s........%10.2f", word, number);
	}

}