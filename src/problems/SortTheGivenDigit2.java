package problems;

public class SortTheGivenDigit2
{
	public static void main(String[] args)
	{
		int n=234984;
		int temp=n;
		int arrSize=0;
		while(temp>0)
		{
			arrSize++;
			temp/=10;
		}
		int[] numArr=new int[arrSize];
		temp=n;
		int k=0;
		while(temp>0)
		{
			numArr[k++]=temp%10;
			temp/=10;
		}


		for(int i=0;i<arrSize;i++)
		{
			for (int j = 0; j < arrSize; j++)
			{
				if(numArr[i]>numArr[j])
				{
					int temp1=numArr[i];
					numArr[i]=numArr[j];
					numArr[j]=temp1;
				}
			}

		}

		for(int i : numArr)
		{
			System.out.print(i);
		}
	}
}
