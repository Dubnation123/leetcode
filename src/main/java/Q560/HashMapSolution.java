package Q560;

import java.util.HashMap;
import java.util.Map;

public class HashMapSolution {
    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        Map<Integer, Integer> memo = new HashMap<>();
        memo.put(0,1);
        for (int num : nums) {
            sum += num;
            if (memo.containsKey(sum - k)) {
                count += memo.get(sum - k);
            }
            memo.compute(sum, (key, value) -> value == null ? 1 : value + 1);
        }
        return count;
    }
}
