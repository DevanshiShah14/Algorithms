package Recursion;

/*695. Max Area of Island
Given a non-empty 2D array grid of 0's and 1's, an island is a group of 1's (representing land) 
connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are 
surrounded by water.

Find the maximum area of an island in the given 2D array. (If there is no island, the maximum area is 0.)

Example 1:

[[0,0,1,0,0,0,0,1,0,0,0,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,1,1,0,1,0,0,0,0,0,0,0,0],
 [0,1,0,0,1,1,0,0,1,0,1,0,0],
 [0,1,0,0,1,1,0,0,1,1,1,0,0],
 [0,0,0,0,0,0,0,0,0,0,1,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,0,0,0,0,0,0,1,1,0,0,0,0]]
Given the above grid, return 6. Note the answer is not 11, because the island must be connected 4-directionally.
Example 2:

[[0,0,0,0,0,0,0,0]]
Given the above grid, return 0.*/

public class MaxAreaofIsland {

	public int maxAreaOfIsland(int[][] grid) {
		int maxIsland = 0, currMax = 0;
		boolean visited[][] = new boolean[grid.length][grid[0].length];
		for (int i = 0; i < visited.length; i++)
			for (int j = 0; j < visited[i].length; j++)
				visited[i][j] = false;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				currMax = 0;
				if(grid[i][j]==1 && visited[i][j]==false) {
					currMax = dfs(grid,visited,i,j,currMax);
				}
				maxIsland = maxIsland>currMax? maxIsland: currMax;
			}
		}
		return maxIsland;
	}

	public int dfs(int[][] grid, boolean[][] visited, int r, int c, int currMax) {
		if(grid[r][c]==1 && visited[r][c]==false) {
			visited[r][c] = true;
			currMax++;
			if(r!=0) 
				currMax = dfs(grid, visited, r-1, c, currMax);
			if(r!= grid.length-1) 
				currMax = dfs(grid, visited, r+1, c, currMax);
			if(c!=0) 
				currMax = dfs(grid, visited, r, c-1, currMax);
			if(c!= grid[0].length-1) 
				currMax = dfs(grid, visited, r, c+1, currMax);
	}
		
		return currMax;
	}

}
