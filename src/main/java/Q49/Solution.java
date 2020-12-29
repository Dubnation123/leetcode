package Q49;

import java.util.*;

// Exceed time limitation
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<Map<Character, Integer>> memo = new LinkedList<>();
        List<List<String>> result = new LinkedList<>();
        for (String s: strs) {
            Map<Character, Integer> local = new HashMap<>();
            boolean found = false;
            for (char c: s.toCharArray()) {
                local.put(c, local.getOrDefault(c, 0) +1);
            }
            for (int i = 0; i< memo.size(); i++) {
                if (memo.get(i).equals(local)) {
                    found = true;
                    result.get(i).add(s);
                    break;
                }
            }
            if (!found) {
                memo.add(local);
                result.add(new ArrayList<>(List.of(s)));
            }
        }
        return result;
    }
}
