package array;

import java.util.HashMap;

public class TwoSum {
	// leetcode - Datastructure
	/**
	 * 1. Given an array of integers, return indices of the two numbers such that
	 * they add up to a specific target. You may assume that each input would have
	 * exactly one solution, and you may not use the same element twice.
	 */

	public static void main(String args[]) {
		int nums[] = { 2, 7, 11, 15 };
		int target = 9;
		int arr1[] = twoSum(nums, target);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}

	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> hash = new HashMap<>();
		int tempArr[] = new int[2];
		for (int i = 0; i < nums.length; i++) {
			int rem = target - nums[i];
			if (hash.containsKey(rem)) {
				tempArr[0] = hash.get(rem);
				tempArr[1] = i;
				break;
			} else
				hash.put(nums[i], i);
		}
		return tempArr;

	}
}
/**
 * Alternate method works for sorted array of +ve int
 * 
 * 		int arr[] = new int[2];
		int j = nums.length - 1;
		int i = 0;
		while (i < nums.length && j >= 0) {
			int currentTotal = nums[i] + nums[j];
			if (currentTotal > target) {
				j--;
			} else if (currentTotal < target) {
				i++;
			} else if (currentTotal == target) {
				System.out.println("[" + i + " , " + j + "]");
				arr[0] = i;
				arr[1] = j;
				break;
			}
		}
		return arr;
 **/
