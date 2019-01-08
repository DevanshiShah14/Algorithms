package array;
/**
 * 821. Given a string S and a character C, return an array of integers representing the shortest distance from the character C in the string.

Example 1:

Input: S = "loveleetcode", C = 'e'
Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
 *
 */

public class ShortestDistanceToACharacter {
	public static void main(String args[]) {
		String S = "baab";
		char C = 'b';
		int arry[] =shortestToChar(S, C);
		for(int k = 0; k<= arry.length; k++) {
			System.out.println(arry[k]);
		}
	}
	
	public static int[] shortestToChar(String S, char C) {
		int prev = -1;
		int next = -1;
		int arr[] = new int[S.length()];
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == C) {
				arr[i] = 0;
				prev = i;
			}
			if (i > next || next==0) {
				innerloop: for (int j = i; j < S.length(); j++) {
					if (S.charAt(j) == C) {
						next = j;
						break innerloop;
					}
				}
			if(i> next)
				next=-1;
			}
			if (prev != -1 && next != -1)
				arr[i] = Math.min(i - prev, next - i);
			else if (next == -1)
				arr[i] = i - prev;
			else if (prev == -1)
				arr[i] = next - i;
		}
		return arr;
	}
}
