package Q695;

public class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int area = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j< grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    area = Math.max(area, helper(grid, i, j));
                }
            }
        }
        return area;
    }

    public int helper(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i == grid.length || j== grid.length || grid[i][j] ==0) {
            return 0;
        }
        grid[i][j] = 0;
        return 1 + helper(grid, i-1, j) + helper(grid, i, j-1) + helper(grid, i+1, j) + helper(grid, i, j+1);
    }
}
