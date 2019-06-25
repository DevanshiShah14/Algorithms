package hashing;
/*438. Find All Anagrams in a String
Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.

Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

The order of output does not matter.

Example 1:

Input:
s: "cbaebabacd" p: "abc"

Output:
[0, 6]

Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
Example 2:

Input:
s: "abab" p: "ab"

Output:
[0, 1, 2]

Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllAnagramsInAString {
	public List<Integer> findAnagrams(String s, String p) {
		List<Integer> result = new ArrayList<>();
		if(s.length()<p.length() || p.length()==0)
			return result;
		HashMap<Character, Integer> map = new HashMap<>();
		for(char c: p.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		int counter = map.size();
		int length = p.length();
		int start =0, end =0;
		while(end< s.length()) {
			char atEnd = s.charAt(end);
			if(map.containsKey(atEnd)) {
				map.put(atEnd, map.get(s.charAt(end))-1);
				if(map.get(atEnd)==0)
					counter--;
			}
			end++;
			
			while(counter==0) {
				if(end-start==length)
					result.add(start);
				char atStart = s.charAt(start);
				if(map.containsKey(atStart)) {
					map.put(atStart, map.get(atStart)+1);
					if(map.get(atStart)>0)
						counter++;
				}
				start++;
			}
		}
		return result;	
	}
}
