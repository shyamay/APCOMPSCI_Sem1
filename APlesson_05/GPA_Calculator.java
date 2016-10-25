import java.util.Scanner;
public class GPA_Calculator
{
	static String GPA;
	static String gov;
	static String anatomy;
	static String physics;
	static String math;
	static String computer;
	static String aerobics;
	static String english;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your grade for Gov: ");
		gov = kb.next();
		System.out.println("Please enter your grade for Anatomy: ");
		anatomy = kb.next();
		System.out.println("Please enter your grade for Physics:");
		physics = kb.next();
		System.out.println("Please enter your grade for Calculus: ");
		math = kb.next();
		System.out.println("Please enter your grade for Computer Science: ");
		computer = kb.next();
		System.out.println("Please enter your grade for Aerobics: ");
		aerobics = kb.next();
		System.out.println("Please enter your grade for Literature: ");
		english = kb.next();
		double gPoints = ((calcPoints(gov) + calcPoints(anatomy) + calcPoints(physics) + calcPoints(math) + calcPoints(computer) + calcPoints(aerobics) + calcPoints(english))/7);
		print(gPoints);
	}
	
	public static double calcPoints(String grade)
	{
		if (grade.equals ("A"))
			return 4.0;
		
		if (grade.equals ("B"))
			return 3.0;
		
		if (grade.equals ("C"))
			return 2.0;
		
		if (grade.equals ("D"))
			return 1.0;
		
		else
			return 0.0;
	}
	
	public static void print(double gPoints)
	{
		System.out.printf("Your GPA is %.5f ", gPoints);
	}
}