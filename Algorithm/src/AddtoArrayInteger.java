package array;
/*989. Add to Array-Form of Integer
For a non-negative integer X, the array-form of X is an array of its digits in left to right order.  For example, if X = 1231, then the array form is [1,2,3,1].

Given the array-form A of a non-negative integer X, return the array-form of the integer X+K.

 

Example 1:

Input: A = [1,2,0,0], K = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234
Example 2:

Input: A = [2,7,4], K = 181
Output: [4,5,5]
Explanation: 274 + 181 = 455
Example 3:

Input: A = [2,1,5], K = 806
Output: [1,0,2,1]
Explanation: 215 + 806 = 1021
Example 4:

Input: A = [9,9,9,9,9,9,9,9,9,9], K = 1
Output: [1,0,0,0,0,0,0,0,0,0,0]
Explanation: 9999999999 + 1 = 10000000000*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddtoArrayInteger {
	public static void main(String args[]) {
		int A[] = {1,8,9,0};
		int K = 29456778;
		AddtoArrayInteger obj = new AddtoArrayInteger();
		System.out.println(obj.addToArrayForm(A, K));
	}

	public List<Integer> addToArrayForm(int[] A, int K) {
		int carryBit = 0;
		int sum = 0;
		List<Integer> result = new ArrayList<>();
		int i = A.length - 1;
		while(i>=0 || K>0) { // check whether length of K> length of A[] and vise versa
			if(i>=0) {
				sum = A[i] + K % 10 + carryBit;
				i--;
				}
			else
				sum = K % 10 + carryBit;
			carryBit = sum / 10;
			sum = sum%10;
			result.add(sum);
			K = K / 10;
		}
		if(carryBit>0)
			result.add(carryBit);
		
		Collections.reverse(result);
		return result;
	}
}
