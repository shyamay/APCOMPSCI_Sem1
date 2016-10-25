import java.util.Scanner; 

public class BMIPart2
{
	static double height;
	static double weight;
	static double bmi;
	static String category;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your height in inches: ");
		height = kb.nextDouble();
		System.out.println("Please enter your weight in pounds: ");
		weight = kb.nextDouble();
		calcBMI();
		print();
	}
	
	public static void calcBMI()
	{
		bmi = ((weight*703)/(height*height));
		
		if (bmi < 18.5)
			category = "condition is Underweight.";
		else if (bmi < 25)
			category = "condition is Normal.";
		else if (bmi < 30)
			category = "condition is Overweight.";
		else if (bmi < 35)
			category = "condition is Obese.";
		else if (bmi < 40)
			category = "condition is Very Obese.";
		else 
			category = "condition is Morbidly Obese.";
	}
	
	public static void print()
	{
		System.out.printf("Your BMI is %.5f ", bmi);
		System.out.printf("Your " + category);
	}
}