import java.util.Scanner; //import Statement

public class SYIDcard
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//instantiate a new SYReceipt object
		SYIDcard ID = new SYIDcard();
		
		//prompt for user input
		System.out.println("Enter your first name: ");
		String first = keyboard.nextLine();
		
		System.out.println("Enter your last name: ");
		String last = keyboard.nextLine();
		
		System.out.println("Enter your title: ");
		String title = keyboard.nextLine();
		
		System.out.println("Enter the school site: ");
		String site = keyboard.nextLine();
		
		System.out.println("Enter the school year: ");
		String year = keyboard.nextLine();
		
		System.out.println("What is your subject? ");
		String subject = keyboard.nextLine();
		
/* 		String first = "Shyama";
		String last = "Yallapragada";
		String title = "Student";
		String site = "Torrey Pines";
		String year = "2016-17";
		String subject = "Neuroscience"; */
		
		System.out.println("***********************************");
		
		ID.format(site, year);
		ID.format(first, last);
		ID.format(title, subject);
	
		System.out.println("\n*********************************** ");
	}
	
	public void format(String word, String item)
	{
		System.out.printf("\n* %15s %15s*", word, item);
	}
	
}