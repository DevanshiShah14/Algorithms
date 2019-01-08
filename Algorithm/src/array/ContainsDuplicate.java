package array;

import java.util.HashSet;

/**
 * 217. Given an array of integers, find if the array contains any duplicates.
 * 
 * Your function should return true if any value appears at least twice in the
 * array, and it should return false if every element is distinct.
 *
 */
public class ContainsDuplicate {
	
	public static void main(String args[]) {
		int arr[] = {1,2,3};
		System.out.println(containsDuplicate(arr));
	}

	public static boolean containsDuplicate(int[] nums) {
		if(nums==null || nums.length<2)
			return false;
		
		HashSet<Integer> hash = new HashSet<>();
		for(int i=0; i<nums.length; i++) {
			if(hash.contains(nums[i])) {
				return true;
			}
			else
				hash.add(nums[i]);
		}
		
		return false;
	}
}
