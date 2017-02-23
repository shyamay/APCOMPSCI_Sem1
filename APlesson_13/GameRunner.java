import java.util.Scanner;
public class GameRunner
{
	public static void main(String[]args)
	{
		PlayStation ps4 = new PlayStation("ps4");
		System.out.println(ps4);
		
		XBox xb = new XBox("xb");
		System.out.println(xb);
		
		PC_Class PC = new PC_Class("PC");
		System.out.println(PC);
	}
}