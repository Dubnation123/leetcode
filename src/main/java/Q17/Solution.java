package Q17;

import java.util.*;

public class Solution {
    Map<String, String> phone = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return Collections.emptyList();
        }
        letter(0, digits, "", result);
        return result;
    }

    private void letter(int start, String digits, String curr, List<String> result) {
        if (start == digits.length()) {
            result.add(curr);
            return;
        }
        String chars = phone.get(String.valueOf(digits.charAt(start)));
        for (int j = 0; j < chars.length(); j++) {
            curr = curr.concat(String.valueOf(chars.charAt(j)));
            letter(start+1, digits, curr, result);
            curr = curr.substring(0, curr.length()-1);
        }
    }
}
