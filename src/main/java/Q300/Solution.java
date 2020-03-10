package Q300;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) return 0;
        int[] result = new int[nums.length];
        result[0] = 1;
        int globalMax = 1;
        for (int i=1; i<nums.length; i++) {
            int localMax = Integer.MIN_VALUE;
            for (int j=i-1; j>=0; j--) {
                if (nums[j] < nums[i]) {
                    localMax = Math.max(localMax, result[j] + 1);
                }

            }
            result[i] = localMax == Integer.MIN_VALUE? 1 : localMax;
            globalMax = Math.max(globalMax, result[i]);
        }
        return globalMax;
    }
}
