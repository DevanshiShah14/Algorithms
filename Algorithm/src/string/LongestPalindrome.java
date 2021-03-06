package string;

import java.util.HashMap;
import java.util.Map.Entry;

/*409. Longest Palindrome
Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

This is case sensitive, for example "Aa" is not considered a palindrome here.

Note:
Assume the length of given string will not exceed 1,010.

Example:

Input:
"abccccdd"

Output:
7

Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.*/

public class LongestPalindrome {
	public static void main(String args[]) {
		String s = "add";
		LongestPalindrome obj = new LongestPalindrome();
		System.out.println(obj.longestPalindrome(s));
	}
	public int longestPalindrome(String s) {
		int ans = 0;
		 int[] count = new int[128];
	        for (char c: s.toCharArray())
	            count[c]++; 
	
	        for (int v: count) {
	            ans += v / 2 * 2;
	            if (ans % 2 == 0 && v % 2 == 1)
	                ans++;
	        }
	        return ans;
	}
}
