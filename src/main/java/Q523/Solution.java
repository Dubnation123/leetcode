package Q523;

import java.util.Arrays;

// Absolutely brute force lol
public class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        for (int i = 2; i < nums.length+1; i++) {
            for (int j = 0; j + i <nums.length+1; j++ ) {
                int[] subArray =Arrays.copyOfRange(nums, j, j+i);
                int subSum = sum(subArray);
                if (k == 0) {
                    if (subSum == 0) {
                        return true;
                    }
                } else {
                    if (subSum % k == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private int sum(int[] array) {
        return Arrays.stream(array).sum();
    }
}
