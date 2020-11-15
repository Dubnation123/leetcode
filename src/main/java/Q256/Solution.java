package Q256;

import java.util.Arrays;

public class Solution {
    public int minCost(int[][] costs) {
        int numOfHouse = costs.length;
        int[] currentMemo = new int[3];
        if ( numOfHouse == 0) {
            return 0;
        } else if (numOfHouse == 1) {
            return Arrays.stream(costs[0]).min().getAsInt();
        } else {
            int[] previousMemo = costs[0];
            for (int i = 1; i < numOfHouse; i++) {
                for (int j = 0; j < 3; j++) {
                    if (j == 0) {
                        currentMemo[j] = Math.min(previousMemo[1], previousMemo[2]);
                    } else if (j == 1) {
                        currentMemo[j] = Math.min(previousMemo[0], previousMemo[2]);
                    } else {
                        currentMemo[j] = Math.min(previousMemo[0], previousMemo[1]);
                    }
                    currentMemo[j] += costs[i][j];
                }
                previousMemo = currentMemo.clone();
            }
            return Arrays.stream(currentMemo).min().getAsInt();
        }
    }
}
