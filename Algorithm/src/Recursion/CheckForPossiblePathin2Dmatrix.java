package Recursion;

/*geeksforgeeks
 * Given a 2D array(m x n), check if there is any path from top left to bottom right. In the matrix, -1 is considered as blockage (can’t go through this cell) and 0 is considered path cell (can go through it).

Examples:

Input : arr[][] = {{ 0, 0, 0, -1, 0},
                  {-1, 0, 0, -1, -1},
                  { 0, 0, 0, -1, 0},
                  {-1, 0, 0,  0, 0},
                  { 0, 0, -1,  0, 0}}
Output : Yes

Input : arr[][] = {{ 0, 0, 0, -1, 0},
                  {-1, 0, 0, -1, -1},
                  { 0, 0, 0, -1, 0},
                  {-1, 0, -1,  0, 0},
                  { 0, 0, -1,  0, 0}}
Output : No
*/
public class CheckForPossiblePathin2Dmatrix {
	static boolean isPath(int arr[][]) 
    {
		if(arr[0][0]==-1)
			return false;
		else
			return checkpath(arr, 0, 0);
    }

	public static boolean checkpath(int[][] arr, int i, int j) {
		
		if(arr[i][j]==0 && i == arr.length && j == arr[0].length)
			return true;
		boolean up= false,down = false,left= false,right = false;
		if(arr[i][j]==0) {
			if(i!=0)
				up = checkpath(arr, i-1, j);
			if(j!=0) 
				down = checkpath(arr, i, j-1);
			if(i!= arr.length) 
				left = checkpath(arr, i+1, j);
		
			if(j!= arr[0].length) 
				right = checkpath(arr, i, j+1);
		}
		return left || right || up || down;
	}
}
