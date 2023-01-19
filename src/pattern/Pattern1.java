package pattern;

//5 4 3 2 1
//  4 3 2 1  space 1
//    3 2 1  space 2
//      2 1  space 3
//        1  space 4
//      2 1  space 3
//    3 2 1  space 2
//  4 3 2 1  space 1
//5 4 3 2 1  space 0
public class Pattern1
{
	public static void main(String[] args)
	{
		int n=4;
		for(int i=0;i<n-1;i++)
		{
			int space=0;
			while(space<i)
			{
				System.out.print(" "+" ");
				space++;
			}
			int val=n-i;
			while(val>0)
			{
				System.out.print(val-- +" ");
			}
			System.out.println();
		}

		for(int i=1;i<=n;i++)
		{
			int space=n;
			space=space-i;
			int val=n;
			while(space>0)
			{
				System.out.print("  ");
				space--;
				val--;
			}
			while(val>0)
			{
				System.out.print(val+" ");
				val--;
			}



			System.out.println();
		}


		}

	}

