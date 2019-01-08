package hashing;

public class DuplicateinKDist {

	/**
	 * Check if a given array contains duplicate elements within k distance from each other
	 * algo: 
	 */
	public static void main(String args[]) {
		int arr[] = {1, 2, 3, 4, 1, 7, 2, 3, 4};
		int k = 3;
		boolean isRepeated = false;
		for (int i = 0; i<arr.length; i++) {
			for (int j = i+1; j<= i+k && j<arr.length; j++) {
				if (arr[i]== arr[j]) {
					System.out.println("Output is: True");
					System.out.println(arr[i]+ " is repeated within distance "+ k);
					isRepeated = true;
					break;
				}
			}
		}
		if(!isRepeated) {
			System.out.println("Output is: False");
		}
	}
}
