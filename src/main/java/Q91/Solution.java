package Q91;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int numDecodings(String s) {
        Map<String, Integer> memo = new HashMap<>();
        return helper(s, memo);
    }

    public int helper(String s, Map<String, Integer> memo) {
        if (s.length() == 0) return 1;
        if (s.charAt(0) == '0') return 0;
        if (s.length() == 1) {
            return 1;
        }
        if (memo.containsKey(s)) return memo.get(s);
        if (Integer.parseInt(s.substring(0, 2)) >=10 && Integer.parseInt(s.substring(0, 2)) <=26) {
            int result = helper(s.substring(1), memo) + helper(s.substring(2), memo);
            memo.put(s, result);
            return result;
        }
        int result =helper(s.substring(1), memo);
        memo.put(s, result);
        return result;
    }
}
