package Q122;

public class OnePassSolution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int maxProfit = 0;
        int prev = Integer.MAX_VALUE;
        for (int i = 0; i< prices.length; i++) {
            if (prices[i] > prev) {
                maxProfit += prices[i] - prev;
            }
            prev = prices[i];
        }
        return maxProfit;
    }
}
