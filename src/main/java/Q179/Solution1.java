package Q179;

import java.util.Arrays;
import java.util.Collections;

public class Solution1 {
    public String largestNumber(int[] nums) {
        String[] strings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strings[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(strings, Collections.reverseOrder((a,b) -> (a+b).compareTo(b+a)));
        if (strings[0].equals("0")) {
            return "0";
        }
        return String.join("", strings);
    }
}
