package DataStructures.problems;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger
{
	public static void main(String[] args)
	{
		Map<Character,Integer> map=new HashMap<>();
		map.put('I',1);
		map.put('V',5);
		map.put('X',10);
		map.put('L',50);
		map.put('C',100);
		map.put('D',500);
		map.put('M',1000);

		String s="MCMXCIV";
		int len=s.length()-1;
		int sum=0;
		int prev=0;
		while(len>=0)
		{
			char c = s.charAt(len);
			int val = map.get(c);
			if(val<prev)
			{
				sum-=val;
			}
			else {
				sum+=val;
			}
			prev=val;
			len--;
		}
		System.out.println(sum);
	}
}
