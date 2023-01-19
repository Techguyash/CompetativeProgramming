package DataStructures.problems;


import java.util.Stack;

public class ValidateParantheses
{
	public static void main(String[] args)
	{
		String s="()[]{}";

		int i=0;
		while(i<s.length())
		{
			Stack<Character> stack = new Stack<>();
			if(s.charAt(i)=='(' || s.charAt(i)=='{'|| s.charAt(i)=='['|| s.charAt(i)=='<')
			{
				stack.push(s.charAt(i));
			}
			if(s.charAt(i)==')'|| s.charAt(i)==']'|| s.charAt(i)=='}'|| s.charAt(i)=='>')
			{
				Character pop = stack.pop();
				
			}
		}

	}
}
