package Q228;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        String restore = null;
        int count = 0;
        if (nums.length == 0) {
            return Collections.emptyList();
        } else {
            restore = String.valueOf(nums[0]);
            count += 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == nums[i - 1] + 1) {
                    count += 1;
                } else {
                    if (count > 1) {
                        result.add(restore + "->" + nums[i - 1]);
                    } else {
                        result.add(restore);
                    }
                    restore = String.valueOf(nums[i]);
                    count = 1;
                }
            }
            if (String.valueOf(nums[nums.length -1]).equals(restore)) {
                result.add(restore);
            } else {
                result.add(restore + "->" + nums[nums.length - 1]);
            }
        }
        return result;
    }
}
