package hashing;
import java.util.List;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class UnionIntersection {
	/**
	 * Given two Linked Lists, 
	 * create union and intersection lists that contain union and intersection of the elements present in the given lists. 
	 * Order of elments in output lists doesn’t matter.
	 */

	public static void main(String args[]) {
		ArrayList<Integer> list1 = new ArrayList<Integer>(
				Arrays.asList(10,15,4,20));
		ArrayList<Integer> list2 = new ArrayList<Integer>(
				Arrays.asList(8,4,2,10));
		
		HashMap<Integer, Integer> hashmap = new HashMap<>();
		List<Integer> newList = new ArrayList<Integer>(list1);
		newList.addAll(list2);
		for(int i : newList)
		 {
			 if(hashmap.containsKey(i)) {
				 int value = hashmap.get(i) + 1;
				 hashmap.put(i, value);
			 }else 
			 {
				hashmap.put(i, 1); 
			 }
		 }
		
		HashMap<Integer, Integer> union = new HashMap<>();
		for (Entry<Integer, Integer> entry : hashmap.entrySet()) {
            if (entry.getValue()> 1) {
                union.put(entry.getKey(), 0);
            }
		}
        
		System.out.println("The Intersection of List1 and List2 is: " + union.keySet());
				
		System.out.println("The Union of List1 and List2 is: " + hashmap.keySet());
	}
}
