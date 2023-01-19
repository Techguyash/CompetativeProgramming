package pattern;
/*
inp=4

1 1 1 2 1 3 1 4
2 1 2 2 2 3 2 4
3 1 3 2 3 3 3 4
4 1 4 2 4 3 4 4

*/

public class Pattern4
{
	public static void main(String[] args)
	{
		int inp=4;
		int n=inp*2;
		for(int i=1;i<=inp;i++)
		{
			int dummy=1;
			for(int j=1;j<=n;j++)
			{
				if(j%2==0)
				{
					System.out.print(dummy++ +" ");
				}
				else{
					System.out.print(i+" ");
				}
			}
			System.out.println();
		}
	}
}
