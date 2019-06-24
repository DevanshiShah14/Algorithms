package array;

import java.util.Arrays;

/*581. Shortest Unsorted Continuous Subarray
Given an integer array, you need to find one continuous subarray that if you only sort this subarray
in ascending order, then the whole array will be sorted in ascending order, too.

You need to find the shortest such subarray and output its length.

Example 1:
Input: [2, 6, 4, 8, 10, 9, 15]
Output: 5
Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array
sorted in ascending order.*/
public class ShortestUnsortedContinuousSubarray {
	public int findUnsortedSubarray(int[] nums) {
		int[] temp = nums.clone();
		Arrays.sort(nums);
		int start = nums.length, end = 0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]!=temp[i]) {
				start = Math.min(i, start);
				end = Math.max(i, end);
			}
		}
		return (end-start >=0? end-start+1 :0);
	}
}
