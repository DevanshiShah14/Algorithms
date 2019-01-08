package array;

import java.util.HashMap;
import java.util.Map;

/**
 * 560. Given an array of integers and an integer k, you need to find the total
 * number of continuous subarrays whose sum equals to k.
 */
public class SubarraySumEqualsK {

	public static void main(String args[]) {
		int arr[] = { 1, 2, 3 };
		int k = 3;
		System.out.println(subarraySum(arr, k));
	}

	public static int subarraySum(int[] nums, int k) {
		if (nums == null || nums.length == 0)
			return 0;

		int sum = 0;
		int count = 0;

		Map<Integer, Integer> map = new HashMap<>();
		for (int i : nums) {
			sum += i;
			if (sum == k)
				count++;

			map.put(sum, map.getOrDefault(sum, 0) + 1);
			if (map.containsKey(sum - k)) {
				count += map.get(sum - k);
			}
		}
		return count;
	}
}
