package Q96;

public class Solution {
    public int numTrees(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int[] result = new int[n+1];
        result[0] = 0;
        result[1] = 1;

        for (int i = 0; i < n + 1; i++) {
            if (i == 0) {
                result[0] = 0;
            } else if (i == 1) {
                result[1] = 1;
            } else {
                int localSum = 0;
                for (int j = 1; j < i -1; j++) {
                    localSum += result[j] * result[i-1-j];
                }
                result[i] = 2 * result[i-1] + localSum;
            }
        }
        return result[n];
    }
}
