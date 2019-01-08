package hashing;
import java.util.HashSet;

public class IsSubset {
	
	public static void main(String args[]) {
		int arr1[] = {11, 13, 21, 3, 7, 1};
	    int arr2[] = {11, 3, 7, 1, 5};
	    
	    if(isSubset(arr1, arr2)) {
			System.out.println("arr2[] is a subset of arr1[]");
		}else
			System.out.println("arr2[] is not a subset of arr1[]");
	    
	}
    
	/**
	 * Given two arrays: arr1[0..m-1] and arr2[0..n-1]. 
	 * Find whether arr2[] is a subset of arr1[] or not.
	 * Both the arrays are not in sorted order. 
	 * It may be assumed that elements in both array are distinct
	 */
	public static boolean isSubset(int[] arr1, int[] arr2) {
		HashSet<Integer> array1 = new HashSet<Integer>();
		/*
		for(Integer value : arr1) {
			
		}*/
		for( int i = 0; i<=arr1.length -1; i++) {
			array1.add(arr1[i]);
		}
		for(int i = 0; i<=arr2.length -1; i++) {
			int arr = arr2[i];
			if(!array1.contains(arr))
				return false;
		}
		return true;		
	}
}
