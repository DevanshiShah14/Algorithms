package hashing;

import java.util.HashSet;
import java.util.Set;

/*771. Jewels and Stones
You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: J = "aA", S = "aAAbbbb"
Output: 3
Example 2:

Input: J = "z", S = "ZZ"
Output: 0*/

public class JewelsandStones {

	public int numJewelsInStones(String J, String S) {

		Set<Integer> hash =  new HashSet<>();
		for(int i=0; i<J.length(); i++) {
			hash.add(J.charAt(i)-'a');
		}
		int count = 0;
		for(int i=0; i<S.length(); i++) {
			if(hash.contains(S.charAt(i)-'a')) {
				count++;
			}
		}
		return count;
	}
}
