package array;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/*3. Longest Substring Without Repeating Characters
Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
Note that the answer must be a substring, "pwke" is a subsequence and not a substring.*/
             
public class LongestSubstringwithoutRepeatingCharacters {

	public static void main(String args[]) {
		String s = "abcabcbae";
		System.out.println(lengthOfLongestSubstring(s));
	}
	
	public static int lengthOfLongestSubstring(String s) {
		Set<Character> hash = new HashSet<>();
		Queue<Character> que = new LinkedList<>();
		int len = Integer.MIN_VALUE;
		int count = 0;
		for(int i=0; i<s.length();i++) {
			if(hash.contains(s.charAt(i))){
				len = count > len? count: len;
				while(que.peek().charValue()!= s.charAt(i)) {
					Character temp = que.remove();
					if(hash.contains(temp)) hash.remove(temp);
					count--;
				}
				Character temp = que.remove();
				hash.remove(temp);
				count--;
			}
			count++;
			que.add(s.charAt(i));
			hash.add(s.charAt(i));
		}
		len = count > len? count: len; 
		return len;
	}
}
