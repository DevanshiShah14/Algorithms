package string;

import java.util.Arrays;

/**
 * 242.Given two strings s and t , write a function to determine if t is an
 * anagram of s.
 * 
 * Example 1:
 * 
 * Input: s = "anagram", t = "nagaram" Output: true
 */
public class ValidAnagram {

	public static void main(String args[]) {
		String s = "anagram";
		String t = "nagaram";
		System.out.println(isAnagram(s,t));
	}
	
	public static boolean isAnagram(String s, String t) {
		char tempArray[] = s.toCharArray();
		char tempArray1[] = t.toCharArray();
		Arrays.sort(tempArray);
		Arrays.sort(tempArray1);
		String str = new String(tempArray);
		String str1 = new String(tempArray1);
		if (str.equals(str1))
			return true;
		return false;
	}
}
