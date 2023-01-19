package DataStructures.problems;


/*
Input: pattern = "abba", s = "dog cat cat dog"
Output: true
*/


import java.util.HashMap;
import java.util.Map;

public class WordPattern_290
{
	public static void main(String[] args)
	{
		String pattern="abba";
		String s="dog cat cat dog";


		System.out.println(wordPattern(pattern,s));

	}


	public static boolean wordPattern(String pattern, String s)
	{

		String[] words = s.split(" ");
		Map<Character, String> map = new HashMap<>();

		if (pattern.length() == words.length)
		{
			for (int i = 0; i < pattern.length(); i++)
			{
				char char_val = pattern.charAt(i);
				if (map.containsKey(char_val))
				{
					if(!map.get(char_val).equals(words[i]))
					{
						return false;
					}
				}
				else
				{
					if (map.containsValue(words[i]))
					{
						return false;
					}
					map.put(char_val, words[i]);
				}
			}
		}
		else return false;
		return true;
	}
}
