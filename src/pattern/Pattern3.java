package pattern;

//  *    *
//  *   *
//  *  *
//  * *
//  **
//  * *
//  *  *
//  *   *
//  *    *

public class Pattern3
{
	public static void main(String[] args)
	{
		int n=6;
		int m=n;
		while(n>1)
		{
			for (int i = 1; i <= n; i++)
			{
				if (i == 1 || i == n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			n--;
		}
		int row=3;
		while(row<=m)
		{
			for(int i=1;i<=row;i++)
			{
				if (i == 1 || i == row)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			row++;
		}
	}
}
