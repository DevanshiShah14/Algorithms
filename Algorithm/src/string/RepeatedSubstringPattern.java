package string;

/**
 * 459 Given a non-empty string check if it can be constructed by taking a
 * substring of it and appending multiple copies of the substring together. You
 * may assume the given string consists of lowercase English letters only and
 * its length will not exceed 10000.
 * 
 * Example 1: Input: "abab" Output: True Explanation: It's the substring "ab"
 * twice.
 **/

public class RepeatedSubstringPattern {
	public static void main(String args[]) {
		String s = "abcabc";
		System.out.println(repeatedSubstringPattern(s));
	}

	public static boolean repeatedSubstringPattern(String s) {
		return s.concat(s).indexOf(s, 1) < s.length();
	}
}
