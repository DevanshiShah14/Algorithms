package hashing;
import java.util.HashMap;

public class GroupMultipleOccurence {
/**
 * Given an unsorted array with repetitions, the task is to group multiple occurrence of individual elements.
 * The grouping should happen in a way that the order of first occurrences of all elements is maintained.
 *
 */
	public static void main(String args[]) {
		int arr[] = { 4, 6, 9, 2, 3, 4, 9, 6, 10, 4 };
		HashMap<Integer, Integer> hashmap = new HashMap<>();
		// (k,v)

		for (int i = 0; i < arr.length; i++) {
			if (hashmap.containsKey(arr[i])) {
				int updatedValue = hashmap.get(arr[i]) + 1;
				hashmap.put(arr[i], updatedValue);
			} else {
				hashmap.put(arr[i], 1);
			}
		}

		for (int j = 0; j < arr.length; j++) {
			if (hashmap.containsKey(arr[j])) {
				int times = hashmap.get(arr[j]);
				for (int i = 0; i < times; i++) {
					System.out.print(arr[j] + " ");
				}
			}
			hashmap.remove(arr[j]);
		}
	}
}
