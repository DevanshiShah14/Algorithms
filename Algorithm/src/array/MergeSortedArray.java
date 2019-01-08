package array;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as
 * one sorted array.
 * 
 * Note:
 * 
 * The number of elements initialized in nums1 and nums2 are m and n
 * respectively. You may assume that nums1 has enough space (size that is
 * greater or equal to m + n) to hold additional elements from nums2.
 *
 */
public class MergeSortedArray {

	public static void main(String args[]) {
		int nums1[] = { 1, 2, 3, 6, 0, 0};
		int m = 4;
		int nums2[] = { 2, 6};
		int n = 2;
		merge(nums1, m, nums2, n);
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int index = m+n-1;
		m--;
		n--;
			while(m>=0 && n>=0) {
				if(nums1[m]> nums2[n]) {
					nums1[index]= nums1[m];
					m--;
					index--;
				}
				else if(nums1[m]< nums2[n]) {
					nums1[index]= nums2[n];
					n--;
					index--;
				}
				else if(nums1[m]== nums2[n]) {
					nums1[index]= nums2[n];
					nums1[index-1]= nums1[m];
					m--;
					n--;
					index--;
					index--;
				}
			}
			while(n>=0) {
				nums1[index]= nums2[n];
				index--;
				n--;
			}
		
		for(int j=0; j<nums1.length; j++) {
			System.out.println(nums1[j]);
		}
	}
}
