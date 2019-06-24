package array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*784. Letter Case Permutation
Given a string S, we can transform every letter individually to be lowercase or uppercase to create another string.  Return a list of all possible strings we could create.

Examples:
Input: S = "a1b2"
Output: ["a1b2", "a1B2", "A1b2", "A1B2"]

Input: S = "3z4"
Output: ["3z4", "3Z4"]

Input: S = "12345"
Output: ["12345"]
		*/

public class letterCasePermutation {
	public List<String> letterCasePermutation(String S) {
		List<String> result = new ArrayList<>();
		doPermutation(result, S.toCharArray(), 0);
		return result;
	}

	private void doPermutation(List<String> result, char[] charArr, int i) {
		if (i == charArr.length)
			result.add(new String(charArr));
		else {
			if (Character.isLetter(charArr[i])) {
				charArr[i] = Character.toLowerCase(charArr[i]);
				doPermutation(result, charArr, i + 1);
				charArr[i] = Character.toUpperCase(charArr[i]);
			}doPermutation(result, charArr, i + 1);
		}
	}
}
