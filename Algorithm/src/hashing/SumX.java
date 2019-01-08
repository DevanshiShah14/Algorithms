package hashing;
import java.util.HashSet;

public class SumX {

	/**
	 * Given an array A[] and a number x, check for pair in A[] with sum as x
	 * 
	 */
	public static void main (String args[]){
		int arr[] = {4,5,6,7,8};
			//{1,2,5,7,4,8,3,6,11,0};
		int k = 5;
		boolean isPresent = false;
		HashSet<Integer> array1 = new HashSet<Integer>();
		
		for(int i = 0; i<arr.length; i++) {
			int requiredNum = k- arr[i];
			if(array1.contains(requiredNum)) {
				isPresent = true;
				System.out.println("Array has two elements whose sum is " + k + " which are " + arr[i] + " and "+ requiredNum);
				break;
			}
			else {
				array1.add(arr[i]);
			}
		}
		
		if(!isPresent) {
			System.out.println("Array doesn't have two elements with sum "+ k);
		}
	}
}
