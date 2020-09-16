package Q167;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] numbers, int target) throws Exception {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }
        throw new Exception("Impossible!");
    }
}
