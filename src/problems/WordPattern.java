package problems;

import java.util.HashMap;
import java.util.Map;

class WordPattern {

	public static void main(String[] args)
	{
		String pattern="abba";
		String s="dog cat cat dog";

		System.out.println(wordPattern(pattern,s));

	}
	public static boolean wordPattern(String pattern, String str) {
		String[] words = str.split(" ");
		if (words.length != pattern.length())
			return false;

		Map<Character, Integer> charToIndex = new HashMap<>();
		Map<String, Integer> stringToIndex = new HashMap<>();

		for (Integer i = 0; i < pattern.length(); ++i)
		{

			if (charToIndex.put(pattern.charAt(i), i) != stringToIndex.put(words[i], i))
			{
				return false;
			}
		}

		return true;
	}
}