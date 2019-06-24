package array;
/** HackerRank
 * Emma is playing a new mobile game that starts with consecutively numbered clouds.
 * Some of the clouds are thunderheads and others are cumulus.
 * She can jump on any cumulus cloud having a number that is equal to the number of the current cloud plus 1 or 2. 
 * She must avoid the thunderheads. 
 * Determine the minimum number of jumps it will take Emma to jump from her starting postion to the last cloud.
 * It is always possible to win the game.
 * 
Sample Input
0 0 1 0 0 1 0

Sample Output
4
 */
public class JumpingOnTheCloud {
	public static void main(String args[]) {
		int[] c = {0,0,0,1,0};
		System.out.println(jumpingOnClouds(c));
	}
	public static int jumpingOnClouds(int[] c) {
		if (c.length == 0)
			return 0;
		int position = -1;
		int last = -1;
		int jump = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 0 && position == -1) {
				position = i;
			} else if (c[i] == 0 && position > -1) {
				if (i - position == 2) {
					jump++;
					position = i;
				} else if (i - position > 2) {
					jump++;
					position = last;
					i--;
				}
				else if(i==c.length-1) {
					jump++;
				}
				else {
					last = i;
				}
			}
		}
		return jump;
	}
}
