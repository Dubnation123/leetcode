package Q241;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        Map<String, List<Integer>> memo = new HashMap<>();
        List<Integer> ret = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '+' ||
                    input.charAt(i) == '-' ||
                    input.charAt(i) == '*') {
                String s1 = input.substring(0, i);
                String s2 = input.substring(i + 1);
                List<Integer> r1 = memo.getOrDefault(s1, diffWaysToCompute(s1));
                List<Integer> r2 = memo.getOrDefault(s2, diffWaysToCompute(s2));
                for (int i1 : r1) {
                    for (int i2 : r2) {
                        int c = 0;
                        switch (input.charAt(i)) {
                            case '+':
                                c = i1 + i2;
                                break;
                            case '-':
                                c = i1 - i2;
                                break;
                            case '*':
                                c = i1 * i2;
                                break;
                        }
                        ret.add(c);
                    }
                }
            }
        }
        if (ret.size() == 0) {
            ret.add(Integer.valueOf(input));
        }
        memo.put(input, ret);
        return ret;
    }
}
