package array;

/*167. Two Sum II - Input array is sorted
Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.

Note:

Your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution and you may not use the same element twice.
Example:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.*/

public class TwoSumII_SortedInputArray {
	
	public static void main(String args[]) {
		int[] numbers = { 2, 7, 11, 15};
		int target = 17;
		int[] arr = twoSum(numbers, target);
		for (int i : arr) {
			System.out.println(i);
		}
	}

	public static int[] twoSum(int[] numbers, int target) {
		int[] result = new int[2];
		int index1 = 0, index2 = numbers.length-1, diff = 0;
		while (index1 < numbers.length) {
			if(diff==0)
				diff = target - numbers[index1];
			if(numbers[index2]==diff) {
				result[0] = index1+1;
				result[1] = index2+1;
				return result;
			}
			else if(numbers[index1]+ numbers[index2]> target) {
				index2--;
			}
			else if(numbers[index1]+ numbers[index2]< target) {
				index1++;
				diff= 0;
			}
			else
				index2++;
				
		}
		return result;
	}
}
