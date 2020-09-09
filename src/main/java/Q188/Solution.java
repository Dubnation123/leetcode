package Q188;

import java.util.Arrays;

public class Solution {
    public int maxProfit(int k, int[] prices) {
        int s = Math.min(k, prices.length);
        int[] costs = new int[s+1];
        int[] profits = new int[s+1];
        Arrays.fill(costs, Integer.MAX_VALUE);

        for (int i = 0; i < prices.length; i++) {
            for (int j = 1; j <= s; j++) {
                costs[j] = Math.min(costs[j], prices[i] - profits[j-1]);
                profits[j] = Math.max(profits[j], prices[i] - costs[j]);
            }
        }

        return profits[s];
    }
}
