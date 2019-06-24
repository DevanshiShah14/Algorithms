package array;
/*485. Max Consecutive Ones
Easy

336

295

Favorite

Share
Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.*/

public class MaxConsecutiveOnes {
	public static void main(String args[]) {
		int[] nums = {0};
		MaxConsecutiveOnes obj = new MaxConsecutiveOnes();
		System.out.println(obj.findMaxConsecutiveOnes(nums));
	}
	public int findMaxConsecutiveOnes(int[] nums) {
		int max = 0, i=0;
		int result = Integer.MIN_VALUE;
		while(i<nums.length) {
			while(i<nums.length && nums[i]==1) {
				max++;
				i++;
			}
			result = Math.max(result, max);
			max = 0;
			i++;
			}
		return result;
	}

}
