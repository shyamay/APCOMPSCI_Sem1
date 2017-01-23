public class Xs_Os
{
	public static void main(String[]args)
	{
		String[][] xsos = new String [4][4];
		
		for(int i = 0; i < xsos.length; i++)
		{
			for(int j = 0; j < xsos [i].length; j++)
			{
				int pick = (int)(Math.random()*2) + 1;
				if(pick == 1)
				{
					xsos[i][j] = "x";
				}
				else
					xsos[i][j] = "o";
				
				System.out.print(xsos[i][j] + "\t");
			}
			System.out.println();
		}
	}
}