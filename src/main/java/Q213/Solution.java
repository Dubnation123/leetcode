package Q213;

//Able to solve the problem after seeing the hints
public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int result1 = robHouse(nums, 0 , nums.length-2);
        int result2 = robHouse(nums, 1, nums.length-1);
        return Math.max(result1, result2);
    }
    private int robHouse(int[] nums, int start, int end) {
        int preMax = 0;
        int currMax = 0;
        for (int i = start; i<= end; i++) {
            int temp = currMax;
            currMax = Math.max(currMax, preMax + nums[i]);
            preMax = temp;
        }
        return currMax;
    }
}
