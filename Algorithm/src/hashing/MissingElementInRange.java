package hashing;
import java.util.HashSet;

/**
 * Given an array arr[0..n-1] of distinct elements and a range [low, high],
 * find all numbers that are in range, but not in array.
 * The missing elements should be printed in sorted order.
 */

public class MissingElementInRange {
	public static void main(String args[]) {
		int arr[] = { 10, 12, 11, 15 };
		int low = 10;
		int high = 15;

		HashSet<Integer> hashset = new HashSet<Integer>();
		for(int i=0; i<arr.length; i++) {
			hashset.add(arr[i]);
		}
		for(int j = low; j <=high; j++)
		{
			if(!hashset.contains(j)) {
				System.out.println("Output: " + j);
			}
		}
	}
}
