package array;

public class MinimumElement {
/**
 * A sorted array is rotated at some unknown point, find the minimum element in it. By O(Logn)
 */
	public static void main(String args[]) {
		int arr[] = {7,16,20,30,41};
		
		MinElement(arr);
	}

	private static void MinElement(int[] arr) {
		int current = arr.length/2;
		while (current > 0 || current == 0) {
			if(current == 0) {
				System.out.println("The smallest element is: " + arr[current]);
				break;
			}
			else if(arr[current]> arr[current-1]) {
				if(current!= arr.length-1) {
					if(arr[current] > arr[current+1]) {
						System.out.println("The smallest element is: " + arr[current+1]);
						break;
					}else if (arr[current] < arr[current+1]) {
						//check which side to traverse
						if(arr[arr.length-1]> arr[current]) {
							//traverse left
							current = (0+current)/2;
						}else {
							//traverse right
							current =(current+(arr.length-1))/2;
						}
					}
				}
				else {
					if(arr[current] > arr[0]) {
						System.out.println("The smallest element is: " + arr[0]);
						break;
					}
				}
				
			}
			else if (arr[current] < arr[current-1]) {
				System.out.println("The smallest element is: " + arr[current]);
				break;
			}
		}
	}
}
