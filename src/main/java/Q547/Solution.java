package Q547;

public class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] marked = new boolean[isConnected.length];
        int count = 0;

        for (int i = 0; i < isConnected.length; i++) {
            if (!marked[i]) {
                count += 1;
                helper(isConnected, marked, i);
            }
        }
        return count;
    }

    public void helper(int[][] isConnected, boolean[] marked, int i) {
        marked[i] = true;
        for (int j = 0; j < isConnected.length; j++) {
            if (isConnected[i][j] == 1 && !marked[j]) {
                helper(isConnected, marked, j);
            }
        }
    }
}
