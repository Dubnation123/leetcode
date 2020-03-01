package Q53;

import java.util.Arrays;

public class Solution {
    public int maxSubArray(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i==0) {
                result[i] = nums[i];
            } else {
                result[i] = Math.max(nums[i], result[i-1] + nums[i]);
            }
        }
        return Arrays.stream(result).max().getAsInt();
    }
}
