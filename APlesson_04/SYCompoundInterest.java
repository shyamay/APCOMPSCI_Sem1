public class SYCompoundInterest
{
	public static void main(String[]args)
	{
		SYCompoundInterest loan = new SYCompoundInterest();
		int r = 3;
		int P = 35;
		int n = 2;
		int t = 5;
		double comp = loan.calcInterest(r, P, n, t);
		System.out.printf("Your total cost of the loan is $%4.2f\n", comp);
	}
	
	public double calcInterest(int r, int P, int n, int t)
	{
		return((P*(1+r/n))^(n*t))/(12*t);
	}
	
	
}