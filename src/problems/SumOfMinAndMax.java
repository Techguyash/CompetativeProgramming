package problems;

import java.util.ArrayList;
import java.util.Collections;

//  input 12345
//	min digit 1
//	max digit 5
//	output=1+5=6

public class SumOfMinAndMax
{
	public static void main(String[] args)
	{
		int inp=12345;
		ArrayList<Integer> list=new ArrayList<>();
		while (inp>0)
		{
			int rem=inp%10;
			list.add(rem);
			inp/=10;
		}
		Collections.sort(list);
		int size=list.size()-1;
		System.out.println(list.get(0)+list.get(size));
	}
}
