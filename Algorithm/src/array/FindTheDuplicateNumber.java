package array;

import java.util.HashSet;

/*287. Find the Duplicate Number
Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.

Example 1:

Input: [1,3,4,2,2]
Output: 2
Example 2:

Input: [3,1,3,4,2]
Output: 3*/

public class FindTheDuplicateNumber {
	public int findDuplicate(int[] nums) {
		HashSet<Integer> hash = new HashSet<>();
		for(int i: nums) {
			if(hash.contains(i))
				return i;
			else
				hash.add(i);
		}
		return -1;
	}
}
