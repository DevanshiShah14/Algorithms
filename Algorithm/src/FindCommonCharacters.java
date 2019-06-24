package array;
/*1002. Find Common Characters
Given an array A of strings made only from lowercase letters, return a list of all characters that show up in all strings within the list (including duplicates).  For example, if a character occurs 3 times in all strings but not 4 times, you need to include that character three times in the final answer.

You may return the answer in any order.

 

Example 1:

Input: ["bella","label","roller"]
Output: ["e","l","l"]
Example 2:

Input: ["cool","lock","cook"]
Output: ["c","o"]*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class FindCommonCharacters {
	public static void main(String args[]) {
		String[] A = { "bella", "label", "roller" };
		FindCommonCharacters obj = new FindCommonCharacters();
		List<String> result = obj.commonChars(A);
	}

	public List<String> commonChars(String[] A) {
		List<String> result = new ArrayList<>();
		HashMap<Character, Integer> hashFinal = new HashMap<>();
		for (int i = 0; i < A.length; i++) {
			HashMap<Character, Integer> hashTemp = new HashMap<>();
			String curr = A[i];
			char[] currArray = curr.toCharArray();
			if (i == 0) {
				for (int j = 0; j < currArray.length; j++)
					hashFinal.put(currArray[j], hashFinal.getOrDefault((currArray[j]), 0) + 1);
			} else {
				for (int j = 0; j < currArray.length; j++) {
					if (hashFinal.containsKey(currArray[j]) && hashFinal.get(currArray[j]) > 0) {
						hashTemp.put(currArray[j], hashTemp.getOrDefault((currArray[j]), 0) + 1);
						hashFinal.put(currArray[j], hashFinal.get(currArray[j]) - 1);
					}
				}
				hashFinal = hashTemp;
			}
		}
		for (Entry<Character, Integer> curr : hashFinal.entrySet()) {
			while (curr.getValue() > 0) {
				result.add(curr.getKey().toString());
				hashFinal.put(curr.getKey(), curr.getValue() - 1);
			}
		}
		return result;
	}
}
