package Q122;

// 122. Best Time to Buy and Sell Stock II
// My solution is too complicated and exceeds memory limitation
public class Solution {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][prices.length];
        return maxProfitHelper(prices, 0, prices.length-1, dp);
    }

    private int maxProfitHelper(int[] prices, int start, int end, int[][] dp) {
        if (start == end || start > end) {
            return 0;
        } else if (dp[start][end] >0) {
            return dp[start][end];
        } else if (start == end - 1) {
            dp[start][end] = prices[end] > prices[start] ? prices[end] - prices[start] : 0;
            return dp[start][end];
        } else {
            int maxProfit = 0;
            for (int i = start; i<= end; i++) {
                for (int j = i; j <= end; j++) {
                    if (prices[j] > prices[i]) {
                        maxProfit = Math.max(maxProfit, prices[j] - prices[i] + maxProfitHelper(prices, j+1, end, dp));
                    }
                }
            }
            dp[start][end] = maxProfit;
            return maxProfit;
        }
    }
}
