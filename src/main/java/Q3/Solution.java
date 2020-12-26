package Q3;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        for (int i = 0; i< s.length(); i++) {
            Set<String> set = new HashSet();
            for (int j = i; j< s.length(); j++) {
                if (set.contains(Character.toString(s.charAt(j)))) {
                    break;
                } else {
                    set.add(String.valueOf(s.charAt(j)));
                }
            }
            result = Math.max(result, set.size());
        }
        return result;
    }
}
