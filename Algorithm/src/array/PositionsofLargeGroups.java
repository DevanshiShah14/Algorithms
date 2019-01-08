package array;

/** 830. In a string S of lowercase letters, these letters form consecutive groups of the same character.

For example, a string like S = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z" and "yy".

Call a group large if it has 3 or more characters.  We would like the starting and ending positions of every large group.

The final answer should be in lexicographic order.
Input: "abbxxxxzzy"
Output: [[3,6]]
Explanation: "xxxx" is the single large group with starting  3 and ending positions 6.
**/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PositionsofLargeGroups {

	public static void main(String args[]) {
		String S = "abbxxxxzzy";
		System.out.println(largeGroupPositions(S));
	}

	public static List<List<Integer>> largeGroupPositions(String S) {
		int start = 0;
		List<List<Integer>> result = new ArrayList();
		for (int i = 0; i < S.length(); i++) {
			if (i == S.length() - 1 || S.charAt(i) != S.charAt(i + 1)) {
				if (i - start + 1 >= 3)
					result.add(Arrays.asList(new Integer[] { start, i }));
				start = i + 1;
			}
		}
		return result;
	}
}
