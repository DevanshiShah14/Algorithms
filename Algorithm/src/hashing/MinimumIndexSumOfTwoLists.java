package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumIndexSumOfTwoLists {
	public String[] findRestaurant(String[] list1, String[] list2) {
		List<String> result = new ArrayList<>();
		int min = Integer.MAX_VALUE;
		Map<String, Integer> hash = new HashMap<>();
		for (int i = 0; i < list1.length; i++) {
			hash.put(list1[i], i);
		}

		for (int j = 0; j < list2.length && j<= min; j++) {
			if (hash.containsKey(list2[j])) {
               int sum = (hash.get(list2[j])) + j;
                if(sum< min) {
                	result.clear();
                	result.add(list2[j]);
                	min = sum;
                }
                else if(sum==min) {
                	result.add(list2[j]);
                }
			}
		}
		
		return result.toArray(new String[result.size()]);
	}
}
