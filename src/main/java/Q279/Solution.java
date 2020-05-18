package Q279;

public class Solution {
    public int numSquares(int n) {
        if (n == 0) return 0;
        int currPersectSquare = 0;
        int[] result = new int[n+1];
        for (int i = 1; i < n + 1; i++) {
            currPersectSquare = (int) Math.sqrt(i);
            int localMix = Integer.MAX_VALUE;
            for (int j = 1; j < currPersectSquare + 1; j++) {
                localMix = Math.min(localMix, result[i-j*j]);
            }
            result[i] = localMix + 1;
        }
        return result[n];
    }
}
