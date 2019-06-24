package array;

public class RotationCount {
/** Geeks for geeks
 * Consider an array of distinct numbers sorted in increasing order.
 * The array has been rotated (anti-clockwise) k number of times. 
 * Given such an array, find the value of k.
 */
	public static void main(String args[]) {
		int arr[] = {5,6,7,8,9,10,1,2,3};
		
		int smallestNum = arr[0];
		int rotations = 0;
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] < smallestNum) {
				smallestNum = arr[i];
				rotations = i;
			}
		}
		
		System.out.println("Total Rotations are: " + rotations);
	}
}
