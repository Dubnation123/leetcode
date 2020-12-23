package Q22;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    String[] candidates = new String[]{"(", ")"};
    public List<String> generateParenthesis(int n) {
        List<String> result = new LinkedList<>();
        if (n==0) {return Collections.emptyList();}
        generator(n, 0, "", result);
        return result;
    }

    private void generator(int count, int open, String curr, List<String> result) {
        if (count == 0 && open == 0) {
            result.add(curr);
        } else if (count < 0 || open <0 ){
            return;
        } else {
            for (String paren: candidates) {
                curr = curr.concat(paren);
                if (paren.equals("(")) {
                    generator(count-1, open +1, curr, result);
                } else {
                    generator(count, open -1, curr, result);
                }
                curr = curr.substring(0,curr.length()-1);
            }
        }
    }

}
