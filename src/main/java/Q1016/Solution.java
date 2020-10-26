package Q1016;

public class Solution {
    public boolean queryString(String S, int N) {
        for (int i = N; i>= Math.max((N >>> 1),1); i--) {
            String temp = Integer.toBinaryString(i);
            if (!S.contains(temp)) {
                return false;
            };
        }
        return true;
    }
}
