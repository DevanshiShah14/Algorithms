package array;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/*219. Contains Duplicate II
Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false*/
public class ContainsDuplicateII {
	public static void main(String args[]) {
		int[] nums = {1,2,3,1};
		int k = 3;
		ContainsDuplicateII con = new ContainsDuplicateII();
		System.out.println(con.containsNearbyDuplicate(nums, k));
	}
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		Hashtable<Integer, List<Integer>> hash = new Hashtable<>();
		for(int i=0; i< nums.length; i++) {
			if(hash.containsKey(nums[i])) {
				List<Integer> temp = hash.get(nums[i]);
				for(int index: temp) {
					if((Math.abs(index-i)) <= k)
							return true;
				}
				temp.add(i);
				hash.put(nums[i], temp);
			}
			else {
				List<Integer> temp1 = new ArrayList<>();
				temp1.add(i);
				hash.put(nums[i], temp1);
			}
				
		}
		return false;
	}
}
