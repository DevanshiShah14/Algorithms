package hashing;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*748. Shortest Completing Word
Find the minimum length word from a given dictionary words, which has all the letters from the string licensePlate. Such a word is said to complete the given string licensePlate

Here, for letters we ignore case. For example, "P" on the licensePlate still matches "p" on the word.

It is guaranteed an answer exists. If there are multiple answers, return the one that occurs first in the array.

The license plate might have the same letter occurring multiple times. For example, given a licensePlate of "PP", the word "pair" does not complete the licensePlate, but the word "supper" does.

Example 1:
Input: licensePlate = "1s3 PSt", words = ["step", "steps", "stripe", "stepple"]
Output: "steps"
Explanation: The smallest length word that contains the letters "S", "P", "S", and "T".
Note that the answer is not "step", because the letter "s" must occur in the word twice.
Also note that we ignored case for the purposes of comparing whether a letter exists in the word.
Example 2:
Input: licensePlate = "1s3 456", words = ["looks", "pest", "stew", "show"]
Output: "pest"
Explanation: There are 3 smallest length words that contains the letters "s".
We return the one that occurred first.*/

public class ShortestCompletingWord {

	public static void main(String args[]) {
		String licensePlate = "GrC8950";
		String[] words = {"base","according","level","meeting","none","marriage","rest" };
		System.out.println(shortestCompletingWord(licensePlate, words));
	}

	public static String shortestCompletingWord(String licensePlate, String[] words) {
		Map<Character, Integer> hash = new LinkedHashMap<>();
		licensePlate = licensePlate.toLowerCase();
		for (char c : licensePlate.toCharArray()) {
			int temp = c -'a';
			if (temp >= 0 && temp <= 26) {
				if (hash.containsKey(c)) {
					int count = hash.get(c);
					hash.put(c, count + 1);
				} else
					hash.put(c, 1);
			}
		}
		Map<String, Integer> result = new LinkedHashMap<>();
		Map<Character, Integer> temp = new LinkedHashMap<>();
		for (String curr : words) {
			temp =  new LinkedHashMap<>(hash);
			for (char ch : curr.toCharArray()) {
				Character c = new Character(ch);
				if(temp.containsKey(c) && temp.get(c)>0) {
					int count = temp.get(c);
					temp.put(c, count-1);
				}
			}
			List<Integer> zeroValues = temp.values().stream().filter(val -> val == 0).collect(Collectors.toList());
			if(zeroValues.size() == temp.size()) {
				result.put(curr, curr.length());
			}	
		}
		String res = "";
		int min = Integer.MAX_VALUE;
		for(Entry<String, Integer> current : result.entrySet()) {
			if(current.getValue() < min)
				res = current.getKey();
			min = min < current.getValue()? min: current.getValue();
		}
		return res;
	}
}
