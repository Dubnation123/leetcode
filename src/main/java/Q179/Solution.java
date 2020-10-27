package Q179;

import java.util.Arrays;

// The comparator I used here can be much simplified
public class Solution {
    public String largestNumber(int[] nums) {
        String[] strings = new String[nums.length];
        int zeroCounts = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) zeroCounts++;
            strings[i] = Integer.toString(nums[i]);
        }
        if (zeroCounts == nums.length) return "0";
        Arrays.sort(strings, this::comparator);
        return String.join("", strings);
    }

    int comparator(String a, String b) {
        if (a.length() == 0 || b.length() == 0) {
            return 0;
        }
        for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
            if (a.charAt(i) > b.charAt(i)) return -1;
            else if (a.charAt(i) < b.charAt(i)) return 1;
            else if (i == Math.min(a.length(), b.length()) - 1) {
                return a.length() == b.length() ? 0 : (a.length() > b.length()) ? comparator(a.substring(i+1), b) : comparator(a, b.substring(i+1));
            }
        }
        return 0;
    }
}
