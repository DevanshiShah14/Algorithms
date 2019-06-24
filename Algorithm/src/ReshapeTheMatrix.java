package array;
/*566. Reshape the Matrix
 * In MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a new one with different size but keep its original data.

You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.

The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

Example 1:
Input: 
nums = 
[[1,2],
 [3,4]]
r = 1, c = 4
Output: 
[[1,2,3,4]]
Explanation:
The row-traversing of nums is [1,2,3,4]. The new reshaped matrix is a 1 * 4 matrix, fill it row by row by using the previous list.
Example 2:
Input: 
nums = 
[[1,2],
 [3,4]]
r = 2, c = 4
Output: 
[[1,2],
 [3,4]]
Explanation:
There is no way to reshape a 2 * 2 matrix to a 2 * 4 matrix. So output the original matrix.*/
import java.util.LinkedList;
import java.util.Queue;

public class ReshapeTheMatrix {

	public static void main(String args[]) {
		int[][] nums = { { 1, 2 }, { 3, 4 } };
		ReshapeTheMatrix obj = new ReshapeTheMatrix();
		obj.matrixReshape(nums, 2, 4);
	}

	public int[][] matrixReshape(int[][] nums, int r, int c) {
		int[][] result = new int[r][c];

		Queue<Integer> numsQueue = new LinkedList<>();
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[0].length; j++)
				numsQueue.add(nums[i][j]);
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				if (!numsQueue.isEmpty())
					result[i][j] = numsQueue.remove();
				else
					return nums;
			}
		}
       if (!numsQueue.isEmpty())
           return nums;

		return result;
	}
}
