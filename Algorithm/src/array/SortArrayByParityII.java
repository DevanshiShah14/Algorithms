package array;
/*922. Sort Array By Parity II
Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.

Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.

You may return any answer array that satisfies this condition.

 

Example 1:

Input: [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.*/

public class SortArrayByParityII {
	
	public static void main (String args[]) {
		int[] A = {3,5,1,2,4,6};
		SortArrayByParityII obj = new SortArrayByParityII();
		int[] result = obj.sortArrayByParityII(A);
		for(int i: A) {
			System.out.println(i);
		}
	}

	private int[] sortArrayByParityII(int[] A) {
		int j =1;
		for(int i=0; i< A.length; i+=2) {
			if(A[i]%2==1) {
				while(A[j]%2==1)
					j+=2;
			
			int temp = A[i];
			A[i] = A[j];
			A[j] = temp;
			}
		}
		return A;
	}
	
	/* Alternate solution not accurate
	 * public int[] sortArrayByParityII(int[] A) {
		int evenPtr = -1;
		int oddPtr = -1;
		int i = 0;
		while(i< A.length){
			if(i%2==0) {
				if(A[i]%2!=0 && evenPtr==-1)
					evenPtr = i;
			}
			else {
				if(A[i]%2==0  && oddPtr==-1)
					oddPtr = i;
			}
			if(evenPtr!=-1 && oddPtr!=-1) {
				int temp = A[evenPtr];
				A[evenPtr] = A[oddPtr];
				A[oddPtr] = temp;
				i = evenPtr < oddPtr? evenPtr : oddPtr;
				evenPtr = -1;
				oddPtr = -1;
			}
			else
				i++;
		}
		return A;
	}
*/
}
