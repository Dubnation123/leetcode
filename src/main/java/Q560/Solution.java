package Q560;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int subarraySum(int[] nums, int k) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0] == k ? 1: 0;
        }
        int count = 0;
        Map<Integer, Integer> memo = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = i == 0 ? nums[i] : memo.get(i-1) + nums[i];
            if (num == k) count++;
            memo.put(i, num);
        }
        for (int i = 1; i< nums.length; i++) {
            for (int j = i; j< nums.length; j++) {
                int num = memo.get(j) - memo.get(i-1);
                if (num == k) count++;
            }
        }
        return count;
    }
}
