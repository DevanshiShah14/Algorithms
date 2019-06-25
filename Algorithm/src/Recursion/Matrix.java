package Recursion;

/*542. 01 Matrix
Given a matrix consists of 0 and 1, find the distance of the nearest 0 for each cell.

The distance between two adjacent cells is 1.
Example 1: 
Input:

0 0 0
0 1 0
0 0 0
Output:
0 0 0
0 1 0
0 0 0
Example 2: 
Input:

0 0 0
0 1 0
1 1 1
Output:
0 0 0
0 1 0
1 2 1*/

public class Matrix {
	
	public static void main(String args[]) {
		int[][] matrix = new int[3][3];
		matrix[0][0] = 0;
		matrix[0][1] = 0;
		matrix[0][2] = 0;
		matrix[1][0] = 0;
		matrix[1][1] = 1;
		matrix[1][2] = 0;
		matrix[2][0] = 0;
		matrix[2][1] = 0;
		matrix[2][2] = 0;
		updateMatrix(matrix);
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[0].length; j++)
				System.out.println(matrix[i][j]);
	}
	public static int[][] updateMatrix(int[][] matrix) {
		boolean[][] visited = new boolean[matrix.length][matrix[0].length];
		for (int i = 0; i < visited.length; i++) 
			for (int j = 0; j < visited[0].length; j++) 
				visited[i][j] = false;
				
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] != 0) {
					matrix[i][j] = find0(matrix,i, j, 1, Integer.MAX_VALUE, visited);
				}
			}
		}
		return matrix;
	}

	private static int find0(int[][] matrix, int i, int j, int distance,int cellValue, boolean[][] visited) {
		if(visited[i][j]==false && cellValue!=1) {
			if(i!=0) {
				if(matrix[i-1][j]== 0) {
					visited[i-1][j] = true;
					if(distance < cellValue)
						cellValue = distance;
				}
				else if(visited[i-1][j]==false)
					find0(matrix, i-1, j, distance+1, cellValue,visited);
			}
			if(j!=0) {
				if(matrix[i][j-1]==0) {
					visited[i][j-1] = true;
					if(distance < cellValue)
						cellValue = distance;
					}
				else if(visited[i][j-1]==false)
						find0(matrix, i, j-1, distance+1, cellValue,visited);
			}
			if(i!=matrix.length-1) {
				if(matrix[i+1][j]==0) {
					visited[i+1][j] = true;
					if(distance < cellValue)
						cellValue = distance;
					}
					else
						find0(matrix, i+1, j, distance+1, cellValue,visited);
			}
			if(j!=matrix[0].length-1) {
				if(matrix[i][j+1]==0) {
					visited[i][j+1] = true;
					if(distance < cellValue)
						cellValue = distance;
					}
					else
						find0(matrix, i, j+1, distance+1, cellValue,visited);
			}
		}
		return cellValue;
	}
}
