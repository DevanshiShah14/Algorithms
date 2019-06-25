package hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*957. Prison Cells After N Days
There are 8 prison cells in a row, and each cell is either occupied or vacant.

Each day, whether the cell is occupied or vacant changes according to the following rules:

If a cell has two adjacent neighbors that are both occupied or both vacant, then the cell becomes occupied.
Otherwise, it becomes vacant.
(Note that because the prison is a row, the first and the last cells in the row can't have two adjacent neighbors.)

We describe the current state of the prison in the following way: cells[i] == 1 if the i-th cell is occupied, else cells[i] == 0.

Given the initial state of the prison, return the state of the prison after N days (and N such changes described above.)

 

Example 1:

Input: cells = [0,1,0,1,1,0,0,1], N = 7
Output: [0,0,1,1,0,0,0,0]
Explanation: 
The following table summarizes the state of the prison on each day:
Day 0: [0, 1, 0, 1, 1, 0, 0, 1]
Day 1: [0, 1, 1, 0, 0, 0, 0, 0]
Day 2: [0, 0, 0, 0, 1, 1, 1, 0]
Day 3: [0, 1, 1, 0, 0, 1, 0, 0]
Day 4: [0, 0, 0, 0, 0, 1, 0, 0]
Day 5: [0, 1, 1, 1, 0, 1, 0, 0]
Day 6: [0, 0, 1, 0, 1, 1, 0, 0]
Day 7: [0, 0, 1, 1, 0, 0, 0, 0]

Example 2:

Input: cells = [1,0,0,1,0,0,1,0], N = 1000000000
Output: [0,0,1,1,1,1,1,0]*/
		
public class PrisonCellsAfterNDays {
	
	public static void main(String args[]) {
		int[] cells = {0,1,0,1,1,0,0,1};
		int N = 7;
		int[] cells1 = prisonAfterNDays(cells,N);
		for(int j=0; j< cells1.length; j++) {
			System.out.println(cells1[j]);
		}
	}

	public static int[] prisonAfterNDays(int[] cells, int N) {
		Map<String, Integer> seen = new HashMap<>();
		while(N>0) {
			 seen.put(Arrays.toString(cells), N--);
			int[] temp = new int[cells.length];
			for(int j=1; j< cells.length-1; j++) {
				if(cells[j-1]==cells[j+1])
					temp[j]= 1;
			}
			cells = temp;
			if(seen.containsKey(Arrays.toString(cells))) {
				N %= seen.get(Arrays.toString(cells)) - N;
			}
			
		}
		return cells;
	}
}