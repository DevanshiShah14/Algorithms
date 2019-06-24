package array;
/*674. Longest Continuous Increasing Subsequence

Given an unsorted array of integers, find the length of longest continuous increasing subsequence (subarray).

Example 1:
Input: [1,3,5,4,7]
Output: 3
Explanation: The longest continuous increasing subsequence is [1,3,5], its length is 3. 
Even though [1,3,5,7] is also an increasing subsequence, it's not a continuous one where 5 and 7 are separated by 4. 
Example 2:
Input: [2,2,2,2,2]
Output: 1
Explanation: The longest continuous increasing subsequence is [2], its length is 1. */

public class LongestContinuousIncreasingSubsequence {
	public static void main(String args[]) {
		int[] nums = {};
		LongestContinuousIncreasingSubsequence obj = new LongestContinuousIncreasingSubsequence();
		System.out.println(obj.findLengthOfLCIS(nums));
	}

	public int findLengthOfLCIS(int[] nums) {
		int result = 0, i = 0;
		for(int j=1; j<nums.length; j++) {
			if (nums[j] <= nums[j-1]) {
				result = Math.max(result, (j - i));
				i=j;
			}
		}
		result = Math.max(result, (nums.length) - i);
		return result;
	}
}

/* Solution
 * int result = 0, count = 0;
for (int i = 0; i < nums.length; ++i) {
    if (i > 0 && nums[i-1] >= nums[i]) 
    	count = i;
    result = Math.max(result, i - count + 1);
}
return result; */
