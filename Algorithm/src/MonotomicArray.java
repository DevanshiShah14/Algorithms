package array;
/**
 * An array is monotonic if it is either monotone increasing or monotone decreasing.
An array A is monotone increasing if for all i <= j, A[i] <= A[j].
An array A is monotone decreasing if for all i <= j, A[i] >= A[j].
Return true if and only if the given array A is monotonic.
*/
public class MonotomicArray {

	public static void main(String args[]) {
		int arr[]= {1,3,2};
		
		System.out.println(isMonotonic(arr));
	}
	
	public static boolean isMonotonic(int[] A) {
		if(A.length <2) {
			return true;
		}
		
		int tone= -1;
		int prev = A[0];
		int curr = A[0];
		
		for(int i=1; i<A.length; i++) {
			curr = A[i];
			if(curr< prev && tone== -1) {
				tone = 0; // decreasing
			}
			else if(curr> prev && tone== -1) {
				tone = 1; // increasing
			}
			else if(curr==prev && tone== -1) {
				tone = -1;
			}
			
			if(tone ==0) {
				if(curr>prev) {
					return false;
				}
			}
			else if(tone==1) {
				if(curr<prev) {
					return false;
				}
			}
			prev=A[i];
		}
		return true;
    }
}
