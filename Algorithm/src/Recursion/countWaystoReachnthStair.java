package Recursion;

import java.util.HashMap;
import java.util.Map;

/*GeeksforGeeks
 * Count ways to reach the nth stair using step 1, 2 or 3
A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3 steps at a time. Implement a method to count how many possible ways the child can run up the stairs.

There are two methods to solve this problem
1. Recursive Method
2. Dynamic Programming

Examples :

Input : 4
Output : 7

Input : 3
Output : 4*/
public class countWaystoReachnthStair {

	static Map<Integer, Integer> hash = new HashMap<>();
	public static int countWays(int n) {
		if(n==1 || n==0)
			return 1;
		else if(n==2)
			return 2;
		else if(n==3)
			return 4;
		else {
			if(hash.containsKey(n))
				return hash.get(n);
			
			int result =  countWays(n-3)+
					countWays(n-2)+
					countWays(n-1);
			hash.put(n,result);
			return result;
		}
			
	}
}
