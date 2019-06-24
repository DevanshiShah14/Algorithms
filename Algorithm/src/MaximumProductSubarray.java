package array;

/*152. Given an integer array nums, find the contiguous subarray within an array
 * (containing at least one number) which has the largest product.

Example 1:

Input: [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
*/

public class MaximumProductSubarray {

	public static void main(String args[]) {
		int[] nums = {-2,3,-4,2,-3};
		System.out.println(maxProduct(nums));
	}

	public static int maxProduct(int[] nums) {
		int maxProduct = nums[0];
		int max = maxProduct,min = maxProduct;
		for(int i =1;  i<nums.length; i++) {
			if(nums[i]<0) { //swapping
				int temp = min;
				min = max;
				max = temp;
			}
			max = Math.max(max*nums[i], nums[i]);
			min = Math.min(min*nums[i], nums[i]);
				
			maxProduct = Math.max(maxProduct, max);
		}
		return maxProduct;
	}
}
