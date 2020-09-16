package Q260;

import java.util.HashMap;
import java.util.Map;

//This solution uses Hashmap and is O(N) time complexity and O(N) space complexity
// Another amazing solution using bitwise operation - hard to understand but lower the space complexity to O(1)
public class Solution1 {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int n: nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        int[] output = new int[2];
        int idx = 0;
        for (Map.Entry<Integer, Integer> item : count.entrySet())
            if (item.getValue() == 1) output[idx++] = item.getKey();
        return output;
    }
}
