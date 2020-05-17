package Q152;

public class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int globalMax = 0;
        int preNegMax = 0;
        int prePosMax = 0;
        for (int i = 0; i < nums.length; i++) {
            int negMax = nums[i] >= 0 ? preNegMax * nums[i] : Math.min(nums[i], prePosMax * nums[i]);
            int posMax = nums[i] >= 0 ? Math.max(nums[i], prePosMax * nums[i]) : preNegMax * nums[i];
            globalMax = Math.max(posMax, globalMax);
            preNegMax = negMax;
            prePosMax = posMax;
        }
        return  globalMax;
    }
}
