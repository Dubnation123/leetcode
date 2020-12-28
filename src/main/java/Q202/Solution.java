package Q202;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        int loop = sum(n);
        while(loop != 1) {
            if (seen.contains(loop)) {
                return false;
            } else {
                seen.add(loop);
                loop = sum(loop);
            }
        }
        return true;
    }

    private int sum(int n) {
        int result = 0;
        while (n / 10 != 0 || n %10 != 0) {
            result += Math.pow(n%10, 2);
            n = n/10;
        }
        return result;
    }
}
