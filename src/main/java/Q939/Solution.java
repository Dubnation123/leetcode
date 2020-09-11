package Q939;

import java.util.Arrays;
import java.util.Comparator;

//Apparently exceeds time limit

public class Solution {
    public int minAreaRect(int[][] points) {
        int result = Integer.MAX_VALUE;
        boolean flag = false;
        int xMax = Arrays.stream(points).max(Comparator.comparingInt(p -> p[0])).get()[0];
        int yMax = Arrays.stream(points).max(Comparator.comparingInt(p -> p[1])).get()[1];
        int[][] dataMap = new int[xMax+1][yMax+1];
        for (int i = 0; i < points.length; i++) {
            int[] currentPoint = points[i];
            dataMap[currentPoint[0]][currentPoint[1]] = 1;
        }
        for (int i = 0; i < xMax; i++) {
            for (int j = 0; j< yMax; j++) {
                if (dataMap[i][j] > 0) {
                    for (int k=i+1; k<xMax; k++) {
                        if (dataMap[k][j] > 0) {
                            for (int l=j+1; l <yMax; l++) {
                                if (dataMap[i][l] >0 && dataMap[k][l] >0) {
                                    flag = true;
                                    result = Math.min(result, (k-i)*(l-j));
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!flag) {
            return 0;
        } else {
            return result;
        }
    }
}
