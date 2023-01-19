package problems;

import java.util.Arrays;

public class LongestConsequtiveNumber
{
	public static void main(String[] args)
	{
		int[] arr=new int[]{1,2,4,5,7,8};

//		1 2 3 5 10 45 46 47 48 49 100
		Arrays.sort(arr);
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		int maxLen=0;
		//		1 2 6 8 9
		for(int i=0;i<arr.length;i++)
		{
			int val=arr[i];
			int len=1,prev=val;
			for (int j = i+1; j < arr.length; j++)
			{
				if(i==j) continue;
				if(arr[j]==prev+1)
				{
					len++;
					prev=arr[j];
				}
				else{
					break;
				}
			}
			if(len>maxLen) maxLen=len;
		}
		System.out.println("\n"+maxLen);
	}
}
