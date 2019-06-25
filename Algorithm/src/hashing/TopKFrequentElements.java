package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*347. Top K Frequent Elements
Given a non-empty array of integers, return the k most frequent elements.

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]*/

public class TopKFrequentElements {
	public List<Integer> topKFrequent(int[] nums, int k) {
		List<Integer> result = new ArrayList<>();
		if(nums.length==0)
			return result;
		Map<Integer, Integer> hash = new HashMap<>();
		for(int i=0; i<nums.length; i++) {
			if(hash.containsKey(nums[i])) {
				int count = hash.get(nums[i]);
				hash.put(nums[i], count+1);
			}
			else
				hash.put(nums[i], 1);
		}
		
		for(int elements: hash.keySet()) {
			if(hash.get(elements)>= k)
				result.add(elements);
		}
		return result;
	}
}
