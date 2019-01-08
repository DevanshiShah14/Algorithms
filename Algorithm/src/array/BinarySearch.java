package array;

/* 704. Given a sorted (in ascending order) integer array nums of n elements and a target value, 
 * write a function to search target in nums.
 * If target exists, then return its index, otherwise return -1.
 */

public class BinarySearch {

	public static void main(String args[]) {
		int[] nums = {-1,0,3,5,9,12};
		int target = 9;
		System.out.println(search(nums, target));
	}
	
	public static int search(int[] nums, int target) {
		int left = 0;
		int right = nums.length-1;
		while(left<=right) {
			int mid = left +( right-left)/2;
			
			if(nums[mid]== target)
				return mid;
			
			if(nums[mid]< target)
				left = mid+1;
			else
				right = mid-1;
		}
		return -1;
	}
}
