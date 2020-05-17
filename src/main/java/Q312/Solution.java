package Q312;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// The solution sounds fine - but pass the time limitation (the problem can be better divided)
public class Solution {
    public int maxCoins(int[] nums) {
        Map<List<Integer>, Integer> memos = new HashMap<>();
        return maxCoinsHelper(nums, memos);
    }

    private int[] generateNewArray(int[] nums, int location) {
        int[] result = new int[nums.length - 1];
        for (int i = 0; i < nums.length-1; i++) {
            result[i] = i < location ? nums[i] : nums[i+1];
        }
        return result;
    }

    private int maxCoinsHelper(int[] nums, Map<List<Integer>, Integer> memos) {
        List<Integer> memoKey = Arrays.stream(nums).boxed().collect(Collectors.toList());
        if (memos.containsKey(memoKey)) {
            return memos.get(memoKey);
        }
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            memos.put(memoKey, nums[0]);
            return nums[0];
        } else if (nums.length == 2) {
            memos.put(memoKey, Math.max(nums[0], nums[1]) * (1 + Math.min(nums[0], nums[1])));
            return Math.max(nums[0], nums[1]) * (1 + Math.min(nums[0], nums[1]));
        } else {
            int localMax = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if (i == 0) {
                    localMax = Math.max(localMax, nums[i] * nums[i+1] + maxCoinsHelper(generateNewArray(nums, i), memos));
                } else if (i == nums.length -1) {
                    localMax = Math.max(localMax, nums[i] * nums[i-1] + maxCoinsHelper(generateNewArray(nums, i), memos));
                } else {
                    localMax = Math.max(localMax, nums[i] * nums[i-1] * nums[i+1] + maxCoinsHelper(generateNewArray(nums, i), memos));
                }
            }
            memos.put(memoKey, localMax);
            return localMax;
        }
    }
}
