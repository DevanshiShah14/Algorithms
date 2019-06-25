package Recursion;

/*994. Rotting Oranges
In a given grid, each cell can have one of three values:

the value 0 representing an empty cell;
the value 1 representing a fresh orange;
the value 2 representing a rotten orange.
Every minute, any fresh orange that is adjacent (4-directionally) to a rotten orange 
becomes rotten.
Return the minimum number of minutes that must elapse until no cell has a fresh orange.
If this is impossible, return -1 instead.*/

public class RottingOranges {
	public static void main(String args[]) {
		int[][] grid = new int[3][3];
		grid[0][0] = 2;
		grid[0][1] = 1;
		grid[0][2] = 1;
		grid[1][0] = 1;
		grid[1][1] = 1;
		grid[1][2] = 0;
		grid[2][0] = 0;
		grid[2][1] = 1;
		grid[2][2] = 1;
		System.out.println(orangesRotting(grid));
	}

	public static int orangesRotting(int[][] grid) {
		int totalMin = -1;
		int freshOranges = 0;
		int tempOranges = 0;
		for (int x = 0; x < grid.length; x++)
			for (int y = 0; y < grid[0].length; y++)
				if (grid[x][y] == 1)
					freshOranges++;

		tempOranges = freshOranges;
		while (tempOranges > 0) {
			freshOranges = tempOranges;
			totalMin++;
			for (int x = 0; x < grid.length; x++) {
				for (int y = 0; y < grid[0].length; y++) {
					if (grid[x][y] == totalMin+2) {
						tempOranges -= doMath(x - 1, y, grid,totalMin) + doMath(x, y - 1, grid,totalMin)
						+ doMath(x + 1, y, grid,totalMin) + doMath(x, y + 1, grid,totalMin);
					}
				}
			}
			if (tempOranges == freshOranges) {
				return -1;
			}
		}

		return totalMin+1;
	}

	private static int doMath(int i, int j, int[][] g, int totalMin) {
		if (i < 0 || j < 0 || i >= g.length || j >= g[i].length || g[i][j] != 1 )
			return 0;
		g[i][j] = totalMin+3;
		return 1;
	}
}
