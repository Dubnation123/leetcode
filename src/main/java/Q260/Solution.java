package Q260;

import java.util.Arrays;

public class Solution {
    public int[] singleNumber(int[] nums) {
        if (nums.length == 2) {
            return nums;
        } else {
            Arrays.sort(nums);
            int[] result = new int[2];
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                Integer before = i == 0? Integer.MAX_VALUE : nums[i-1];
                Integer after = i == nums.length-1 ? Integer.MAX_VALUE: nums[i+1];
                if (!(before == nums[i]) && !(after == nums[i])) {
                    result[count] = nums[i];
                    count++;
                }
            }
            return result;
        }
    }
}
