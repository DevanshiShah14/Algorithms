package hashing;

import java.util.HashMap;

/*567. Permutation in String

Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1.
In other words, one of the first string's permutations is the substring of the second string.
Example 1:
Input:s1 = "ab" s2 = "eidbaooo"
Output:True
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:
Input:s1= "ab" s2 = "eidboaoo"
Output: False*/

public class PermutationInString {
	public boolean checkInclusion(String s1, String s2) {
		if(s2.length()<s1.length() || s1.length()==0)
			return false;
		HashMap<Character, Integer> mapS1 = new HashMap<>();
		
		for(char c: s1.toCharArray()) {
			mapS1.put(c, mapS1.getOrDefault(c,0)+1);
		}
		int counter = mapS1.size();
		int start = 0;
		int end = 0;
		int length = s1.length();
		while(end< s2.length()) {
			char atEnd = s2.charAt(end);
			if(mapS1.containsKey(atEnd)) {
				mapS1.put(atEnd, mapS1.get(atEnd)-1);
				if(mapS1.get(atEnd)==0)
					counter--;
			}
			end++;
			while(counter==0) {
				if(end-start==length)
					return true;
				else {
					char atStart = s2.charAt(start);
					if(mapS1.containsKey(atStart)) {
						mapS1.put(atStart, mapS1.get(atStart)+1);
						if(mapS1.get(atStart)>0)
							counter++;
					}
					start++;
				}
				
			}
		}
		return false;
	}
}
