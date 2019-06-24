package array;

public class RemoveDuplicatesFromSortedArray {
/**
 Given a sorted array nums, 
 remove the duplicates in-place such that each element appear only once and return the new length.
 Do not allocate extra space for another array, 
 you must do this by modifying the input array in-place with O(1) extra memory.
 */
	public static void main(String args[]) {

		int nums[] = { 0, 0, 0, 1, 1, 2, 2};
		int count = removeDuplicates(nums);
		System.out.println("lenght =" + count);
		for (int j = 0; j < count; j++) {
			System.out.println(nums[j]);
		}
	}

	public static int removeDuplicates(int[] nums) {
		System.out.println("checking for duplicate");
		int count = 1;
		int toBechecked = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != toBechecked) {
				nums[count] = nums[i];
				toBechecked = nums[i];
				count++;
			}
		}
		return count;
	}
}