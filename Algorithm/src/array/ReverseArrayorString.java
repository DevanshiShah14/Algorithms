package array;

public class ReverseArrayorString {

	public static void main(String args[]) {
		int arr[] = {4, 5, 1, 2, 7, 11};
		
		reverse(arr);
	}

	private static void reverse(int[] arr) {
		
		int start=0;
		int end = arr.length-1;
		
		while(start< end) {
			int temp = arr[start];
			arr[start]= arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		System.out.println("Output arr[]: ");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}
