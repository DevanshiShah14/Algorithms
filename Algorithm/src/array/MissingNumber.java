package array;

import java.util.HashSet;

/*268. Missing Number
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

Example 1:

Input: [3,0,1]
Output: 2
Example 2:

Input: [9,6,4,2,3,5,7,0,1]
Output: 8*/
public class MissingNumber {
	 public int missingNumber(int[] nums) {
		 HashSet<Integer> hash =  new HashSet<>();
		 for(int i : nums)
			 hash.add(i);
		 for(int i=0; i<=nums.length; i++)
			 if(!hash.contains(i))
				 return i;
			 
		return 0;
	    }
}
