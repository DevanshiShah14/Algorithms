package array;

/*Dynamic Programming 
 *  53. Given an integer array nums, find the contiguous subarray (containing at least one number).
 * which has the largest sum and return its sum.
 * 
Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
 */

public class MaximumSubarray {

	public static void main(String args[]) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}

	public static int maxSubArray(int[] nums) {
		int maxtillnow = nums[0];
		int maxsum = nums[0];
		for(int i=1; i< nums.length; i++) {
			maxsum = Math.max(maxsum+ nums[i], nums[i]);
			maxtillnow = Math.max(maxtillnow, maxsum);
		}
		return maxtillnow;
	}
}
