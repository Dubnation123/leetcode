package Q939;

import java.util.*;

//Counting by diagonal - Using HashMap to store data by x-index
public class Solution1 {
    public int minAreaRect(int[][] points) {
        int result = Integer.MAX_VALUE;
        Map<Integer, Set<Integer>> pointList = new HashMap<>();
        for (int[] point:points) {
            pointList.computeIfAbsent(point[0], p -> new HashSet<>()).add(point[1]);
        }
        for (int i = 0; i < points.length; i++) {
            for (int j = i+1; j < points.length; j++) {
                int[] point1 = points[i];
                int[] point2 = points[j];
                if (point1[0] != point2[0] && point1[1] != point2[1]) {
                    if (pointList.get(point1[0]).contains(point2[1]) && pointList.get(point2[0]).contains(point1[1])) {
                        result = Math.min(result, Math.abs((point2[0] - point1[0]) * (point2[1] - point1[1])));
                    }
                }
            }
        }
        return result == Integer.MAX_VALUE ? 0:result;
    }
}
