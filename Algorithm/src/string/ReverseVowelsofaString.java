package string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 345. Write a function that takes a string as input and reverse only the
 * vowels of a string.
 *
 */
public class ReverseVowelsofaString {
	public static void main(String args[]) {
		String s = "leetcode";
		System.out.println(reverseVowels(s));
	}

	public static String reverseVowels(String s) {
		int p1 = 0, p2 = s.length() - 1;
		StringBuilder str = new StringBuilder(s);
		Set<Character> set = new HashSet(
	            Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
		while (p1 <= p2) {
			while (p1 < p2 && !set.contains(str.charAt(p1)))
				p1++;

			while (p2 > p1 && !set.contains(str.charAt(p2)))
				p2--;
			char ch = str.charAt(p1);
			str.setCharAt(p1, str.charAt(p2));
			str.setCharAt(p2, ch);
			p1++;
			p2--;

		}
		return str.toString();
	}
}

/** my solution which doesnt include Uppercase vowels
class Solution {
public String reverseVowels(String s) {
    int p1 = 0, p2 = s.length() - 1;
	StringBuilder str = new StringBuilder(s);
	boolean Assignp1 = false, Assignp2 = false;
	while (p1 < p2) {
		if (Assignp1 == false && (str.charAt(p1) == 'a' || str.charAt(p1) == 'e' || str.charAt(p1) == 'i'
				|| str.charAt(p1) == 'o' || str.charAt(p1) == 'u')) {
			Assignp1 = true;
		}
		if (Assignp2 == false && (str.charAt(p2) == 'a' || str.charAt(p2) == 'e' || str.charAt(p2) == 'i'
				|| str.charAt(p2) == 'o' || str.charAt(p2) == 'u')) {
			Assignp2 = true;
		}
		if (Assignp1 == true && Assignp2 == true) {
			char ch = str.charAt(p1);
			str.setCharAt(p1, str.charAt(p2));
			str.setCharAt(p2, ch);
			Assignp1 = false;
			Assignp2 = false;
		} 
		if(Assignp2==false)
		 p2--;
		if (Assignp1 == false)
			p1++;	
	}
	return str.toString();	
	}
} **/