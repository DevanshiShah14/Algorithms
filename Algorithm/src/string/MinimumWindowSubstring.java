package string;
/*76. Minimum Window Substring
Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).

Example:

Input: S = "ADOBECODEBANC", T = "ABC"
Output: "BANC"
Note:

If there is no such window in S that covers all characters in T, return the empty string "".
If there is such window, you are guaranteed that there will always be only one unique minimum window in S.*/

import java.util.HashMap;

public class MinimumWindowSubstring {

	public static void main(String args[]) {
		String s = "ADOBECODEBANC";
		String t = "ABC";
		MinimumWindowSubstring obj = new MinimumWindowSubstring();
		System.out.println(obj.minWindow(s, t));
	}
public String minWindow(String s, String t) {
	if(s.length()<t.length())
		return "";
	if(s==t)
		return s;
	int len = Integer.MAX_VALUE;
	HashMap<Character, Integer> mapT = new HashMap<>();
	for(char c: t.toCharArray()) {
		mapT.put(c, mapT.getOrDefault(c, 0)+1);
	}
	int counter = mapT.size();
	int start = 0;
	int end = 0;
	int head = 0;
	while(end< s.length()) {
		char atEnd = s.charAt(end);
		if(mapT.containsKey(atEnd)) {
			mapT.put(atEnd, mapT.get(atEnd)-1);
			if(mapT.get(atEnd)==0)
				counter--;
		}
		end++;
		while(counter==0) {
			char atStart = s.charAt(start);
			if(mapT.containsKey(atStart)) {
				mapT.put(atStart, mapT.get(atStart)+1);
				if(mapT.get(atStart)>0)
					counter++;
			}
			if(end-start< len) {
				len = end-start;
				head = start;
			}
			start++;
		}
	}
	return len< Integer.MAX_VALUE? s.substring(head, head+len): " "; 
    }
}
