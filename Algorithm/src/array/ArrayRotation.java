package array;
import java.util.Arrays;

public class ArrayRotation {

	/**
	 * 
	 * Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
	 */
	public static void main(String args[]) {
		int arr[]= {1, 2, 3, 4, 5, 6, 7};
		int d = 3;
		int n = arr.length;
		int newArr[] = new int[n];
		rotate(arr, d, n);
	}

	private static void rotate(int[] arr, int d, int n) {
		int newArr[] = new int[n];
		int newincr = 0;
		for(int i=0; i<n; i++) {
			if(d < n) {
				newArr[i]= arr[d];
				d++;
			}else{
				newArr[i]= arr[newincr];
				newincr++;
			}
		}
		for(int j=0; j< n; j++) {
			System.out.print(newArr[j]+ " ");
		}
	}
}
