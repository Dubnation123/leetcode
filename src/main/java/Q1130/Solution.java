package Q1130;

//Have runtime exception
public class Solution {
    public int mctFromLeafValues(int[] arr) {
        int[][] dp = new int[arr.length][arr.length];
        return helper(arr, 0, arr.length-1, dp);
    }

    private int helper(int[] arr, int start, int end, int[][] dp) {
        if (dp[start][end] > 0) return dp[start][end];
        if (start == end) {
            return 0;
        } else if(end == start + 1) {
            return arr[start] * arr[end];
        }  else {
            int localMin = Integer.MAX_VALUE;
            for (int i = start; i < end; i++) {
                 localMin = Math.min(helper(arr, start, i, dp) + helper(arr, i+1, end, dp) + getMax(arr, start, i) * getMax(arr, i+1, end), localMin);
            }
            dp[start][end] = localMin;
            return localMin;
        }
    }

    private int getMax(int[]arr, int start, int end) {
        int localMax = arr[start];
        for (int i = start + 1; i <=end; i++) {
            localMax = Math.max(localMax, arr[i]);
        }
        return localMax;
    }
}
