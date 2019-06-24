package array;
/*238. Given an array nums of n integers where n > 1, 
 * return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input:  [1,2,3,4]
Output: [24,12,8,6]
Note: Please solve it without division and in O(n).

Follow up:
Could you solve it with constant space complexity?
(The output array does not count as extra space for the purpose of space complexity analysis.)
*/

public class ProductOfArrayExceptSelf {

	public static void main(String args[]) {

	}

	public int[] productExceptSelf(int[] nums) {
		int length = nums.length;
		int result[] = new int[length];
		if(length==0)
			return result;
		int numprefix = 1;
		for(int i=0; i<nums.length; i++) {
			result[i] = numprefix;
			numprefix*= nums[i];
		}
		int numsuffix = 1;
		for(int i=nums.length-1; i>=0;i--) {
			result[i]*= numsuffix;
			numsuffix *= nums[i];
		}
		return result;
		jj
	}
}
