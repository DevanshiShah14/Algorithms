package array;

public class WaveForm {
/**
 * Given an unsorted array of integers, sort the array into a wave like array.
 * An array ‘arr[0..n-1]’ is sorted in wave form if arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= 
 */
	public static void main(String args[]) {
		int arr[]= {3, 6, 5, 10, 7, 20};
		
		waveArray(arr);
	}

	private static void waveArray(int[] arr) {
		
		int current = 0;
		while(current< arr.length) {
			if(current!=0 && arr[current]<arr[current - 1]) {
				int temp = arr[current -1];
				arr[current-1] = arr[current];
				arr[current] = temp;
			}
			if(current!=arr.length-1 && arr[current +1] > arr[current]) {
				int temp = arr[current +1];
				arr[current+1] = arr[current];
				arr[current] = temp;				
			}
			current +=2;
		}
		
		System.out.print("The output arr[] : ");
		for(int i=0; i<arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
