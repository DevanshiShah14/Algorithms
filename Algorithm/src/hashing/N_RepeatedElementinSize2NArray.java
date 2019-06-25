package hashing;

import java.util.HashMap;
import java.util.Map;

/*961. N-Repeated Element in Size 2N Array
In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.

Return the element repeated N times.

 

Example 1:

Input: [1,2,3,3]
Output: 3
Example 2:

Input: [2,1,2,5,3,2]
Output: 2
Example 3:

Input: [5,1,5,2,5,3,5,4]
Output: 5*/

public class N_RepeatedElementinSize2NArray {
	public static void main(String args[]) {
		int[] A = {5,1,5,2,5,3,5,4};
		System.out.println(repeatedNTimes(A));
	}

	public static int repeatedNTimes(int[] A) {
		if(A.length==0)
			return 0;
		int repeat = A.length/2;
		int ans = 0;
		Map<Integer, Integer> hash= new HashMap<>();
		for(int i=0; i<A.length; i++) {
			if(hash.containsKey(A[i])) {
				int count = hash.get(A[i]);
				hash.put(A[i], count+1);
			}
			else
				hash.put(A[i], 1);
		}
		
		for(int value: hash.keySet()) {
			if(hash.get(value)==repeat) {
				return value;
			}
		}
		return 0;
	}

}
