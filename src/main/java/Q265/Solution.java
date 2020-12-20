package Q265;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int minCostII(int[][] costs) {
        if (costs == null || costs.length == 0) {
            return 0;
        } else {
            int colors = costs[0].length;
            for (int i = 1; i < costs.length; i++) {
                int[] sortIndex = sortIndex(costs[i-1]);
                for (int j = 0; j< colors; j++) {
                    if (sortIndex[0] == j) {
                        costs[i][j] += costs[i-1][sortIndex[1]];
                    } else {
                        costs[i][j] += costs[i-1][sortIndex[0]];
                    }
                }
            }
            int len = costs.length;
            return Arrays.stream(costs[len-1]).min().getAsInt();
        }
    }

    public int[] sortIndex(int[] array) {
        int[] result = IntStream.range(0,array.length).toArray();
        for (int i = 0; i < result.length; i++) {
            int min = i;
            for (int j = i+1; j< array.length; j++) {
                if (array[result[j]] < array[result[min]]) {
                    min = j;
                }
            }
            int temp = result[min]; result[min] = result[i]; result[i] = temp;
        }
        return result;
    }
}
