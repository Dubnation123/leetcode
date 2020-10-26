package Q397;

import java.util.HashMap;
import java.util.Map;

// Well, the solution exceeds time limitation and there is a better solution to do it!
public class Solution {
    public int integerReplacement(int n) {
        Map<Integer, Integer> memo = new HashMap<>(n);
        memo.put(1,0);
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                memo.put(i, memo.get(i/2) + 1);
            } else {
                memo.put(i, Math.min(memo.get(i-1) + 1, memo.get((i+1)/2) + 2));
            }
        }
        return memo.get(n);
    }
}
