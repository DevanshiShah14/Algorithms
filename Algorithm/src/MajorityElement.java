package array;
/* 169. Given an array of size n, find the majority element.
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:

Input: [3,2,3]
Output: 3
Example 2:

Input: [2,2,1,1,1,2,2]
Output: 2 */

import java.util.HashMap;

public class MajorityElement {

	public static void main(String args[]) {
		int[] nums = { 2, 2, 2, 1, 1, 1, 2 };
		System.out.println(majorityElement(nums));
	}

	public static int majorityElement(int[] nums) {

		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		for (int i : nums) {
			if (hash.containsKey(i)) {
				hash.put(i, hash.get(i) + 1);
			} else
				hash.put(i, 1);
			if (hash.get(i) > nums.length / 2)
				return i;
		}
		return -1;
	}
}
