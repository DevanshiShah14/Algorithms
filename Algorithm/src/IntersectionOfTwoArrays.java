package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/*349. Intersection of Two Arrays
Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]*/

public class IntersectionOfTwoArrays {

	public int[] intersection(int[] nums1, int[] nums2) {
		List<Integer> result = new ArrayList<>();
		HashSet<Integer> hash = new HashSet<>();
		for(int i: nums1) {
			hash.add(i);
		}
		for(int i: nums2) {
			if(hash.contains(i)) {
				if(result.indexOf(i)==-1)
					result.add(i);
			}
		}
		return result.stream().mapToInt(i -> i).toArray();
	}
}
