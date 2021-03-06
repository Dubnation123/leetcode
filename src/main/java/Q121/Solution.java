package Q121;

// 121. Best Time to Buy and Sell Stock
public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0 || prices.length == 1) return 0;

        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > minPrice) {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            } else  {
                minPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
