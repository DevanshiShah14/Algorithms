package Recursion;

import java.util.ArrayList;
import java.util.List;

/*46. Permutations
Given a collection of distinct integers, return all possible permutations.

Example:

Input: [1,2,3]
Output:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]*/

public class Permutations {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		backTracking(result, new ArrayList(), nums);
		return result;
	}

	private void backTracking(List<List<Integer>> result, ArrayList tempList, int[] nums) {
		if (tempList.size() == nums.length)
			result.add(new ArrayList(tempList));
		for (int i = 0; i < nums.length; i++) {
			if (tempList.contains(nums[i]))
				continue;
			tempList.add(nums[i]);
			backTracking(result, tempList, nums);
			tempList.remove(tempList.size() - 1);
		}
	}
}
