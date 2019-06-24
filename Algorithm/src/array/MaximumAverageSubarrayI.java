package array;

/*643. Maximum Average Subarray I
Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value. And you need to output the maximum average value.

Example 1:

Input: [1,12,-5,-6,50,3], k = 4
Output: 12.75
Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75*/

public class MaximumAverageSubarrayI {

	public static void main(String args[]) {
		int[] nums = { 1, 12, -5, -6, 50, 3 };
		int k = 4;
		MaximumAverageSubarrayI obj = new MaximumAverageSubarrayI();
		System.out.println(obj.findMaxAverage(nums, k));
	}

	public double findMaxAverage(int[] nums, int k) {
		int i = 0;
		int j = 0;
		int count = 0;
		double sum = 0;
		double avg = Integer.MIN_VALUE;
		while (j < nums.length) {
			while (count < k && j < nums.length) {
				sum += nums[j++];
				count++;
			}
			avg = Math.max(avg, sum / k);
			sum -= nums[i++];
			count--;
		}
		return avg;
	}
}
