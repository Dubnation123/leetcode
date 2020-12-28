package Q974;

import java.util.HashMap;
import java.util.Map;

// but this one time out too
public class Solution1 {
    public int subarraysDivByK(int[] A, int K) {
        Map<Integer, Integer> memo = new HashMap<>();
        memo.put(0, 1);
        int sum = 0, count = 0;
        for (int j : A) {
            sum += j;
            for (int key:memo.keySet()) {
                if ((key - sum) % K == 0) {
                    count += memo.get(key);
                }
            }
            memo.put(sum, memo.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
