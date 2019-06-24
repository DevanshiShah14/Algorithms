package array;

/**
 * 283. Given an array nums, write a function to move all 0's to the end of it while
 * maintaining the relative order of the non-zero elements.
 * 
 * You must do this in-place without making a copy of the array. Minimize the
 * total number of operations.
 *
 */
public class MoveZeros {
	public static void main(String args[]) {
		int nums[] = { 0, 1, 0, 3, 12 };
		moveZeroes(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

	public static void moveZeroes(int[] nums) {
		int pointer = 0;
		if (nums.length == 0 || nums.length == 1)
			return;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				pointer++;
			} else {
				if (pointer > 0) {
					nums[i - pointer] = nums[i];
					nums[i] = 0;
				}
			}
		}
	}
}

/**
 Alternate my solution which beats 5% of soutions :) 
 	public static void moveZeroes(int[] nums) { 
 		int zeroIndex = -1; 
 		if(nums.length ==0 || nums.length == 1) return; 
 		for (int i = 0; i < nums.length; i++) { 
 			if (nums[i]== 0 && zeroIndex == -1) { 
 			zeroIndex = i; 
 		} else if (zeroIndex != -1 && nums[i] != 0) { 
 			nums[zeroIndex] = nums[i];
 			nums[i] = 0; 
 			if (zeroIndex + 1 != nums.length) 
 				i = zeroIndex; 
 				zeroIndex = -1; 
 		} 
 	} 
 }
 **/
