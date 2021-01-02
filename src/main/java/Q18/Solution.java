package Q18;

import java.util.*;

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i-1]) {
                for (int j = i+1; j < nums.length; j++) {
                    if (j == i+1 || nums[j] != nums[j-1]) {
                        helper(nums, i, j, target, result);
                    }
                }
            }
        }
        return result;
    }

    private void helper(int[] nums, int index1, int index2,int target, List<List<Integer>> result) {
        Set<Integer> seen = new HashSet<>();
        for (int i = index2+1; i < nums.length ; i++) {
            if (seen.contains(target - nums[index1] - nums[index2]- nums[i])) {
                result.add(List.of(nums[index1], nums[index2], nums[i], target - nums[index1] - nums[index2]- nums[i]));
                while (i < nums.length-1 && nums[i] == nums[i+1]) i++;
            }
            seen.add(nums[i]);
        }
    }
}
