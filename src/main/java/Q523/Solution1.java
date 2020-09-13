package Q523;

// Instead of iterating over the array everytime, we can have a memo to store the sum
// Time complexity - N^2 - 2 for loop
// Space complexity - N - one array to store sum
public class Solution1 {
    public boolean checkSubarraySum(int[] nums, int k) {
        int[] sum = new int[nums.length+1];
        if (nums.length > 0) {
            sum[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                sum[i] = sum[i-1] + nums[i];
            }
        }
        for (int start = 0; start < nums.length -1; start++) {
            for (int end = start + 1; end< nums.length; end ++) {
                int summ = sum[end] - sum[start] + nums[start];
                if (summ == k || (k != 0 && summ % k == 0)) {
                    return true;
                }
            }
        }
        return false;
    }
}
