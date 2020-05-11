package Q85;

import java.util.Arrays;

public class DpMaximumHeightSolution {

    class Result {
        int x = Integer.MIN_VALUE;
        int y = Integer.MAX_VALUE;
        int h = 0;
    }

    public int maximalRectangle(char[][] matrix) {
        int len1 = matrix.length;
        if (len1 == 0) return 0;
        int len2 =matrix[0].length;
        if (len2 == 0) return 0;

        Result[][] results = new Result[len1+1][len2+2];
        for (int i = 0; i < len1 + 1; i++) {
            for (int j = 0; j < len2 + 2; j++) {
                results[i][j] = new Result();
            }
        }

        for (int i = 1; i < len1 + 1; i++) {
            for (int j = 1 ; j < len2 + 1; j++) {
                if (matrix[i-1][j-1] == '1') {
                    Result result = new Result();
                    result.h = results[i-1][j].h + 1;
                    int localX = results[i][j-1].x == Integer.MIN_VALUE? j : Math.min(results[i][j-1].x, j);
                    result.x = Math.max(results[i-1][j].x, localX);
                    results[i][j] = result;
                }
            }
            for (int j = len2; j > 0; j--) {
                if (matrix[i-1][j-1] == '1') {
                    int localY = results[i][j+1].y == Integer.MAX_VALUE? j : Math.max(results[i][j+1].y, j);
                    results[i][j].y = Math.min(results[i-1][j].y, localY);
                }
            }
        }

        return Arrays.stream(results)
                .flatMap(Arrays::stream)
                .filter(r -> r.h != 0)
                .map(r -> (r.y - r.x + 1) * r.h)
                .max(Integer::compareTo)
                .orElse(0);
    }
}
