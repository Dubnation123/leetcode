package Q309;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][prices.length];
        List<Integer> start = findStart(prices, 0 , prices.length-1);
        return maxProfitHelper(prices, start, prices.length-1, dp);
    }

    private List<Integer> findStart(int[] prices, int start, int end) {
        List<Integer> result = new ArrayList<>();
        for (int i = start; i < end; i++) {
            if (i == start) {
                if (prices[i] < prices[i] + 1) {
                    result.add(i);
                }
            } else {
                if (prices[i-1] > prices[i] && prices[i] <= prices[i+1]) {
                    result.add(i);
                }
            }
        }
        return result;
    }

    private int maxProfitHelper(int[] prices, List<Integer> starts, int end, int[][] dp) {
        int globalMax = 0;
        for (int start: starts)  {
            int maxProfit = 0;
            if (start == end || start > end) {
                return 0;
            } else if (dp[start][end] >0) {
                return dp[start][end];
            } else if (start == end - 1) {
                dp[start][end] = prices[end] > prices[start] ? prices[end] - prices[start] : 0;
                return dp[start][end];
            } else {
                for (int j = start; j <= end; j++) {
                    if (prices[j] > prices[start]) {
                        List<Integer> localStart = findStart(prices, j+2, end);
                        maxProfit = Math.max(maxProfit, prices[j] - prices[start] + maxProfitHelper(prices, localStart, end, dp));
                    }
                    dp[j][end] = maxProfit;
                }
            }
            globalMax = Math.max(globalMax, maxProfit);
        }
        return globalMax;
    }
}
