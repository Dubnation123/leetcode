package Q54;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix.length == 0 || matrix[0].length == 0) {
            return Collections.emptyList();
        }
        int xStart = 0;
        int yStart = 0;
        int yEnd = matrix.length-1;
        int xEnd = matrix[0].length-1;
        while (xStart <= xEnd && yStart <= yEnd) {
            result.addAll(outliners(matrix,xStart, yStart, xEnd, yEnd));
            xStart++;
            yStart++;
            xEnd--;
            yEnd--;
        }
        return result;
    }

    private List<Integer> outliners(int[][] matrix, int xStart, int yStart, int xEnd, int yEnd) {
//        Already simplify the logic a little bit here to avoid too many if statements
        List<Integer> result = new ArrayList<>();
        for (int i = xStart; i <= xEnd; i++) {
            result.add(matrix[yStart][i]);
        }
        for (int i = yStart+1; i <= yEnd; i++) {
            result.add(matrix[i][xEnd]);
        }
        if (xStart < xEnd && yStart < yEnd) {
            for (int i = xEnd-1; i >= xStart; i--) {
                result.add(matrix[yEnd][i]);
            }
            for (int i = yEnd-1; i >= yStart + 1; i--) {
                result.add(matrix[i][xStart]);
            }
        }
        return result;
    }
}
