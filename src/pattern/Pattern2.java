package pattern;
//n=4
//12344321 space 0
//123  321 space 2
//12    21 space 4
//1      1 space 6
//12    21
//123  321
//12344321
public class Pattern2
{
	public static void main(String[] args)
	{
		int n=9,space=0;


		for (int i=1;i<=n;i++)
		{
			int j=1;
			while(j<=(n-i)+1)
			{
				System.out.print(j);
				j++;
			}
			int k=1;
			j-=1;
			while(k<=space)
			{
				System.out.print(" ");
				k++;
			}
			space=(space+2);
			while(j>0)
			{
				System.out.print(j);
				j--;
			}

			System.out.println();
		}
		space-=4;
		for(int i=1;i<n;i++)
		{
			int j=1;
			while(j<=i+1)
			{
				System.out.print(j);
				j++;
			}
			j-=1;
			int k=space;
			while(k>0)
			{
				System.out.print(" ");
				k--;
			}
			space-=2;
			while(j>0)
			{
				System.out.print(j);
				j--;
			}

			System.out.println();
		}
	}
}
