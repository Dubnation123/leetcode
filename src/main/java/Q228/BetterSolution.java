package Q228;

import java.util.ArrayList;
import java.util.List;

public class BetterSolution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        for (int i = 0, j = 0; j < nums.length; j++) {
            if (j + 1 < nums.length && nums[j] == nums[j+1] -1) {
                continue;
            }
            if (i == j) {
                result.add(nums[j] + "");
            } else {
                result.add(nums[i] + "->" + nums[j]);
            }
            i = j+1;
        }
        return result;
    }
}
