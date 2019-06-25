package hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/** Code breaks down for long input
 * 389. Given two strings s and t which consist of only lowercase letters.
 * 
 * String t is generated by random shuffling string s and then add one more
 * letter at a random position.
 * 
 * Find the letter that was added in t.
 * 
 * Example:
 * 
 * Input: s = "abcd" t = "abcde"
 * 
 * Output: e
 **/

public class FindTheDifference {
	public static void main(String strgs[]) {
		String s = "abcd"; 
		String t = "abcde";
		System.out.println(findTheDifference(s, t));

	}

	public static char findTheDifference(String s, String t) {
		Map<Character, Integer> hash = new HashMap<Character, Integer>();
		int count = 0;
		for (Character chS : s.toCharArray()) {
			count = 0;
			if (hash.containsKey(chS))
				count = hash.get(chS);
			hash.put(chS, count + 1);
		}
		for (Character chT : t.toCharArray()) {
			if (hash.containsKey(chT)) {
				count = hash.get(chT);
				if (count > 0) {
					hash.put(chT, count - 1);
				} else {
					hash.put(chT, 1);
				}
			} else {
				hash.put(chT, 1);
			}
		}
		Character finalch = '0';
		for (Character num : hash.keySet()) {
			if (hash.get(num) == 1)
				finalch = num;
		}
		return finalch;
	}
}
