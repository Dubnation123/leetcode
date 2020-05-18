package Q221;

public class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0) return 0;
        int len1 = matrix.length;
        int len2 = matrix[0].length;
        int[][] result = new int[len1+1][len2+1];
        int globalMax = 0;

        for (int i = 1; i< len1 + 1; i++) {
            for (int j = 1; j < len2 + 1; j++) {
                if (matrix[i-1][j-1] == '1') {
                    result[i][j] = Math.min(result[i-1][j-1], Math.min(result[i-1][j], result[i][j-1])) + 1;
                    globalMax = Math.max(globalMax, result[i][j]);
                }
            }
        }
        return globalMax * globalMax;
    }
}
