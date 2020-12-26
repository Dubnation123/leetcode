package Q3;

import java.util.HashSet;
import java.util.Set;

public class SlidingWindowSolution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> memo = new HashSet<>();
        int i = 0, j= 0, result = 0;
        while (i < s.length() && j < s.length()) {
            if (!memo.contains(s.charAt(j))) {
                memo.add(s.charAt(j));
                result = Math.max(result, ++j-i);
            } else {
                memo.remove(s.charAt(i));
                i++;
            }
        }
        return result;
    }
}
