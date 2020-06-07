package Q123;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int maxProfit(int[] prices) {
        int i = 0, buy, sell = 0, N = prices.length-1;
        List<Integer> starts = new ArrayList<>();
        List<Integer> ends = new ArrayList<>();
        while (i < N) {
            while (i < N && prices[i+1] <= prices[i]) i++;
            buy = prices[i];
            while (i < N && prices[i+1] > prices[i]) i++;
            sell = prices[i];
            starts.add(buy);
            ends.add(sell);
        }
        if (starts.size() == 0) {
            return 0;
        } else if (starts.size() == 1) {
            return ends.get(0) - starts.get(0);
        } else if (starts.size() == 2) {
            return ends.get(0) - starts.get(0) + ends.get(1) - starts.get(1);
        } else {
            int[][] dp = new int[starts.size()][ends.size()];
            int[][] localMax = new int[starts.size()+1][ends.size()+1];
            for (int k = starts.size() - 1; k >= 0; k--) {
                for (int j = ends.size() -1 ; j >= k; j--) {
                    dp[k][j] = ends.get(j) - starts.get(k);
                    localMax[k][j] = Math.max(localMax[k+1][j], Math.max(localMax[k][j+1], dp[k][j]));
                }
            }
            int maxProfit = 0;
            for (int k = 0; k < starts.size(); k++) {
                for (int j = k; j < ends.size(); j++) {
                    maxProfit = Math.max(maxProfit, dp[k][j] + localMax[Math.max(k,j) + 1][Math.max(k,j) + 1]);
                }
            }
            return maxProfit;
        }
    }
}
