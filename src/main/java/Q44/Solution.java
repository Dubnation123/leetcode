package Q44;

public class Solution {
    public boolean isMatch(String s, String p) {
        boolean[][] result = new boolean[p.length()+1][s.length()+1];
        result[0][0] = true;
            for (int i = 0; i < p.length(); i ++) {
                if (p.charAt(i) == '*') {
                    result[i+1][0] = result[i][0];
                } else {
                    result[i+1][0] = false;
                }
                for (int j = 0; j < s.length(); j++) {
                    if (p.charAt(i) == '*') {
                        if (result[i+1][j]) {
                            result[i+1][j+1] = true;
                        } else {
                            result[i+1][j+1] = result[i][j+1];
                        }
                    } else {
                        if (!result[i][j]) {
                            result[i+1][j+1] = false;
                        } else {
                            if (p.charAt(i) == '?') {
                                result[i+1][j+1] = true;
                            } else {
                                result[i+1][j+1] = p.charAt(i) == s.charAt(j);
                            }
                        }
                    }
                }
        }
        return result[p.length()][s.length()];
    }
}
