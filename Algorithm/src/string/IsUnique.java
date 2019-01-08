package string;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/**
 * 1. Implement an algorithm to determine if a string has all unique characters.
 * What if you can not use additional data structures? Cracking code interview
 */
public class IsUnique {
	public static void main(String args[]) {
		System.out.println(isUnique("abcdee"));
	}

	private static boolean isUnique(String S) {
		if (S.length() == 0 || S.length() == 1)
			return true;
		char[] s = S.toCharArray();
		Arrays.sort(s);
		int prev = 0;
		for (int i = 1; i < s.length; i++) {
			if (s[i] == s[prev])
				return false;
			prev = i;
		}

		return true;
	}

	/**
	 * With additional data structure. 
	 * public static boolean isUnique(String S) {
	 * 		if(S.length()==0 || S.length()==1) return true; 
	 * 		HashSet<Character> hash = new HashSet<>(); 
	 * 			for(char ch: S.toCharArray()) { 
	 * 				if(hash.contains(ch)) 
	 * 					return false; 
	 * 				hash.add(ch); 
	 * 				} 
	 * 		return true; 
	 * }
	 **/

}
