package Q85;

import java.util.Arrays;

// I know why this one is wrong but dont know how to fix it
public class WrongSolution {
    private class Result {
        int x;
        int y;
        int diagonal;
    }

    public int maximalRectangle(char[][] matrix) {
        int len1 = matrix.length;
        if (len1 == 0) return 0;
        int len2 =matrix[0].length;
        if (len2 == 0) return 0;

        Result[][] results = new Result[len1+1][len2+1];
        for (int i = 0; i < len1 +1; i++) {
            for (int j = 0; j < len2 +1; j++) {
                results[i][j] = new Result();
            }
        }

        for (int i = 1; i < len1 +1 ; i++) {
            for (int j = 1; j < len2 +1; j++) {
                if (matrix[i-1][j-1] == '1') {
                    Result result1 = new Result();
                    result1.x = results[i-1][j].x + 1;
                    result1.y = results[i][j-1].y + 1;
                    result1.diagonal = 1;
                    if (results[i-1][j].diagonal != 0 && results[i][j-1].diagonal != 0 && results[i-1][j-1].diagonal != 0) {
                        if (results[i-1][j].diagonal == 1 && results[i][j-1].diagonal ==1) {
                            result1.diagonal = 4;
                        } else if (results[i-1][j].diagonal == 1 || results[i][j-1].diagonal ==1) {
                            result1.diagonal = results[i-1][j].diagonal + results[i][j-1].diagonal + 1;
                        } else {
                            result1.diagonal = results[i-1][j].diagonal + results[i][j-1].diagonal - results[i-1][j-1].diagonal + 1;
                        }
                    }
                    results[i][j] = result1;
                }
            }
        }
        return Arrays.stream(results)
                .flatMap(Arrays::stream)
                .map(r -> Math.max(r.x, Math.max(r.y, r.diagonal)))
                .mapToInt(r -> r)
                .max()
                .orElse(0);
    }
}
