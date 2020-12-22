package Q15;

import java.util.*;

public class TwoPointerSolution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length && nums[i] <=0; i++) {
            if (i == 0 || nums[i] != nums[i-1]) {
                twoSum(nums, i, result);
            }
        }
        return result;
    }

    private void twoSum(int[] nums, int index, List<List<Integer>> result) {
        Set<Integer> seen = new HashSet<>();
        for (int i = index + 1; i < nums.length; i++) {
            int complement = -nums[index] - nums[i];
            if (seen.contains(complement)) {
                result.add(List.of(nums[index], nums[i], complement));
                while (i < nums.length -1  && nums[i+1] == nums[i]) {
                    i++;
                }
            }
            seen.add(nums[i]);
        }
    }
}
