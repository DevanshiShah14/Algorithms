package array;

public class MedianOfSortedArrays {
	// leetcode - Datastructure
	/**
	 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
	 * Find the median of the two sorted arrays. The overall run time complexity
	 * should be O(log (m+n)).
	 */

	public static void main(String args[]) {
		int nums1[] = { 1, 3, 12 };
		int nums2[] = { 2, 10, 15, 21, 57 };
		int nums[] = new int[nums1.length + nums2.length];
		int num1 = 0;
		int num2 = 0;
		float median = 0;
		for (int i = 0; i < nums.length; i++) {
			if ( (num2 == nums2.length) || (num1 < nums1.length && nums1[num1] < nums2[num2])) {
				nums[i] = nums1[num1];
				num1++;
			} else if ((num1 == nums1.length)||(num2 < nums2.length && nums1[num1] > nums2[num2])) {
				nums[i] = nums2[num2];
				num2++;
			}
		}
		
		int oddEven = (nums.length % 2);
		if (oddEven == 0) {
			median = (float)(nums[nums.length/2 -1 ] + nums[nums.length/2]) / 2;
		} else {
			median = nums[(nums.length+1)/2];
		}
		System.out.println("The Median is " + median);
	}
}
