package Recursion;

/*200. Number of Islands
Given a 2d grid map of '1's (land) and '0's (water), count the number of islands.
An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. 
You may assume all four edges of the grid are all surrounded by water.

Example 1:

Input:
11110
11010
11000
00000

Output: 1
Example 2:

Input:
11000
11000
00100
00011

Output: 3*/

public class NumberofIsland {
	public static void main(String args[]) {
		char[][] grid = new char[4][5];
		for (int i = 0; i < grid.length; i++)
			for (int j = 0; j < grid[i].length; j++)
				grid[i][j] = 0;
		grid[0][0] = 1;
		grid[0][1] = 1;
		grid[0][2] = 1;
		grid[0][3] = 1;
		grid[1][0] = 1;
		grid[1][1] = 1;
		grid[1][3] = 1;
		//grid[2][0] = 1;
		//grid[2][1] = 1;
		grid[3][1] = 1;
		grid[3][4] = 1;
		
		System.out.println(numIslands(grid));
	}
	
	public static int numIslands(char[][] grid) {
		int count = 0;
		if(grid.length!=0) {
			boolean visited[][] = new boolean[grid.length][grid[0].length];
			for (int i = 0; i < visited.length; i++)
				for (int j = 0; j < visited[i].length; j++)
					visited[i][j] = false;
			
			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid[i].length; j++) {
					if(grid[i][j]=='1' && visited[i][j]==false) {
						count++;
						dfs(grid,visited,i,j);
					}
				}
			}
		}	
		return count;		
	}

	public static void dfs(char[][] grid, boolean[][] visited, int r, int c) {
		if(grid[r][c]=='1' && visited[r][c]==false) {
			visited[r][c]= true;
			if(r!=0) dfs(grid, visited, r-1, c);
			if(c!=0) dfs(grid, visited, r, c-1);
			if(r!=grid.length-1) dfs(grid, visited, r+1, c);
			if(c!= grid[0].length-1) dfs(grid, visited, r, c+1);
		}
	}
}
