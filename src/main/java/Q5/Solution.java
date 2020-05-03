package Q5;

public class Solution {
    public String longestPalindrome(String s) {
        int length = s.length();
        if (length == 0) {return s;}
        int[] result = new int[]{0,0};
        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j >= i; j--) {
                boolean local = checkString(s, i, j);
                if (local) {
                    if (j - i > result[1] - result[0]) {
                        result[1] = j;
                        result[0] = i;
                    }
                    break;
                }
            }
        }
        return s.substring(result[0], result[1] + 1);
    }

    private boolean checkString(String s, int start, int end) {
        if (start == end) {
            return true;
        } else {
            boolean b = s.charAt(start) == s.charAt(end);
            if (!b) return false;
            else {
                if (end == start + 1) {
                    return true;
                } else {
                    return checkString(s, start + 1, end - 1);
                }
            }
        }
    }
}
