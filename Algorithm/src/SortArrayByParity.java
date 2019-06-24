package array;
/*905. Sort Array By Parity
Given an array A of non-negative integers, return an array consisting of all the even elements of A,
followed by all the odd elements of A.

You may return any answer array that satisfies this condition.

Example 1:

Input: [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
*/

public class SortArrayByParity {
	public static void main(String args[]) {
		int[] A = { 3, 1, 2, 4 };
		sortArrayByParity(A);
		for (int i : A) {
			System.out.println(i);
		}
	}

	public static int[] sortArrayByParity(int[] A) {
		int inc = 0;
		int dec = A.length - 1;
		while (inc < dec) {
			if (A[inc] % 2 > A[dec] % 2) {
				int temp = A[inc];
				A[inc] = A[dec];
				A[dec] = temp;
			}
			if(A[inc]%2==0) inc++;
			if(A[dec]%2==1) dec--;
		}
		return A;
	}
}
