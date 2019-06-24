package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*350. Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]*/

public class IntersectionOfTwoArraysII {
	public static void main(String args[]) {
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		int[] nums = intersect(nums1, nums2);
		for(int k=0; k<nums.length; k++) {
			System.out.println(nums[k]);
		}
	}

	public static int[] intersect(int[] nums1, int[] nums2) {
		List<Integer> num = new ArrayList<Integer>();

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<Integer> num1 = new ArrayList<Integer>();
		for (int i : nums1) {
			if (map.containsKey(i)) {
				int count = map.get(i) + 1;
				map.put(i, count);
			}
			map.put(i, 1);
		}
		
		for(int j:nums2) {
			if(map.containsKey(j)) {
				if(map.get(j)>0) {
					num.add(j);
					map.put(j, map.get(j)-1);
				}
			}
		}

		return num.stream().mapToInt(i -> i).toArray(); // converting Integer ArrayList to Array
	}
}
