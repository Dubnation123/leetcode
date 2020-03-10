package Q673;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int findNumberOfLIS(int[] nums) {
        if (nums.length == 0) return 0;
        int[] result = new int[nums.length];
        int[] count = new int[nums.length];
        result[0] = 1;
        count[0] = 1;
        int globalMax = 1;
        int globalMaxCount = 1;
        for (int i=1; i<nums.length; i++) {
            int localMax = 1;
            int localMaxCount = 1;
            for (int j=i-1; j>=0; j--) {
                if (nums[j] < nums[i]) {
                    if (result[j] + 1 > localMax) {
                        localMax = result[j] + 1;
                        localMaxCount = count[j];
                    } else if (result[j] + 1 == localMax) {
                        localMaxCount += count[j];
                    }
                }
            }
            result[i] = localMax;
            count[i] = localMaxCount;
            globalMax = Math.max(result[i], globalMax);
        }
        List<Integer> indexes = findIndex(result, globalMax);
        return indexes.stream().map(i -> count[i]).reduce(0,Integer::sum);
    }

    public List<Integer> findIndex(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) result.add(i);
        }
        return result;
    }
}
