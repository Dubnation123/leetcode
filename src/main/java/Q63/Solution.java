package Q63;

//感觉在处理这个问题的时候用了太多的if statement，其实问题可以被简化一些的！

public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows = obstacleGrid.length;
        int columns = obstacleGrid[0].length;
        int[][] result = new int[rows][columns];

        for (int i=0; i < rows; i++) {
            for (int j=0; j <columns; j++) {
                if (i==0 && j==0) {
                    if (obstacleGrid[i][j] != 0) {
                        result[i][j] =0;
                    } else {
                        result[i][j] = 1;
                    }
                } else if (i==0) {
                    if (obstacleGrid[i][j] != 0 || result[i][j-1] == 0) {
                        result[i][j] = 0;
                    } else {
                        result[i][j] = 1;
                    }
                } else if (j ==0) {
                    if (obstacleGrid[i][j] != 0 || result[i-1][j] == 0) {
                        result[i][j] = 0;
                    } else {
                        result[i][j] = 1;
                    }
                } else {
                    if (obstacleGrid[i][j] != 0) {
                        result[i][j] = 0;
                    } else {
                        result[i][j] = result[i-1][j] + result[i][j-1];
                    }
                }
            }
        }
        return result[rows-1][columns-1];
    }
}
