import java.util.Scanner;
public class SYCompoundInterest
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the interest rate: ");
		int r = kb.nextInt();
		System.out.println("Enter the original amount you intend to borrow: ");
		int P = kb.nextInt();
		System.out.println("Enter the number of times the loan is compounded per year: ");
		int n = kb.nextInt();
		System.out.println("Enter the life of the loan in years: ");
		int t = kb.nextInt();
		double comp = calcInterest(r, P, n, t);
		System.out.printf("Your total cost of the loan is $%4.2f\n", comp);
	}
	
	public static double calcInterest(int r, int P, int n, int t)
	{
		return((P*(1+r/n))^(n*t))/(12*t);
	}
	
	
}