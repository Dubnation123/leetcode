package Q628;

public class Solution {
    public int maximumProduct(int[] nums) {
        int[] numss = sortArray(nums);
        return Math.max(numss[0] * numss[1] * numss[2], numss[0] * numss[nums.length-1] * numss[nums.length-2]);
    }

    int[] sortArray(int[] input) {
        for (int i = 0; i< input.length; i++) {
            for (int j = i+1; j< input.length; j++) {
                if (input[j] > input[i]) {
                    int temp = input[j]; input[j] = input[i]; input[i] = temp;
                }
            }
        }
        return input;
    }
}
