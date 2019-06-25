package Recursion;

/*74. Search a 2D Matrix
Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
Example 1:

Input:
matrix = [
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
target = 3
Output: true
Example 2:

Input:
matrix = [
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
target = 13
Output: false*/

public class Search2DMatrix {
	
	public boolean searchMatrix(int[][] matrix, int target) {
		if(matrix.length==0)
            return false;
		int i = matrix.length-1;
		int j = 0;
		while(i< matrix.length && j< matrix[0].length && i>=0 && j>=0) {
			 if(matrix[i][j] == target)
					return true;
			 else if(matrix[i][j] > target)
	                i--;
			 else j++;
		}
		return false;		
	}
}
