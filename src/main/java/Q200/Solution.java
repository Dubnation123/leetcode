package Q200;

public class Solution {

    public int numIslands(char[][] grid) {
        int length = grid.length;
        int height = grid[0].length;
        boolean[][] marked = new boolean[length][height];
        int island = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < height; j++) {
                if (grid[i][j] == '1' && !marked[i][j]) {
                    island += 1;
                    helper(grid, marked, i, j);
                }
            }
        }
        return island;
    }

    private void helper(char[][] grid, boolean[][] marked, int m, int n) {
        if (m < 0 || n <0 || m >= grid.length || n >= grid[0].length || grid[m][n] == '0') {
            return;
        }
        if (grid[m][n] == '1') {
            if (!marked[m][n]) {
                marked[m][n] = true;
                helper(grid, marked, m+1, n);
                helper(grid, marked, m, n+ 1);
            } else {
                return;
            }
        }
    }
}
