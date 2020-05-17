package Q198;

public class Solution {
    public int rob(int[] nums) {
        int[] result = new int[nums.length+1];
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        result[1] = nums[0];
        result[2] = nums[1];
        for (int i = 3; i < nums.length + 1; i++) {
            result[i] = nums[i-1] + Math.max(result[i-2], result[i-3]);
        }
        return Math.max(result[nums.length], result[nums.length-1]);
    }
}
