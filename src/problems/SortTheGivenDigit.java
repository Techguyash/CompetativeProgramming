package problems;

public class SortTheGivenDigit
{
	public static void main(String[] args)
	{
		int n=23494;
/*      descending order
		for(int i=9;i>=1;i--)
		ascending order */
		for(int i=9;i>=1;i++)
		{
			int temp=n;
			while(temp>0)
			{
				int rem=temp%10;
				if(i==rem)
				{
					System.out.print(rem);
				}
				temp/=10;
			}
		}
	}
}
