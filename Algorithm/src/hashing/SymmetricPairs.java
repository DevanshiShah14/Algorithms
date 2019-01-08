package hashing;
import java.util.HashMap;

public class SymmetricPairs {

	public static void main(String args[]) {
		int arr[][] = {{11, 20}, {30, 40}, {5, 10}, {40, 30}, {10, 5}};
		
		HashMap<Integer,Integer> hashmap = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			if(hashmap.containsKey(arr[i][0])) {
				
			}
				hashmap.put(arr[i][0], arr[i][1]);
		}
		
		
	}
}
