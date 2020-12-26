package Q953;

public class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        if (words.length != 1) {
            for (int i = 0; i < words.length - 1; i++) {
                if (isLexicographicalOrdered(words[i], words[i + 1], order) > 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private int isLexicographicalOrdered(String s1, String s2, String order) {
        int len1 = s1.length();
        int len2 = s2.length();
        int i = 0;
        while(i < Math.min(len1,len2)) {
            int order1 = order.indexOf(s1.substring(i, i+1));
            int order2 = order.indexOf(s2.substring(i, i+1));
            if (order1 < order2) {
                return -1;
            } else if (order1 > order2) {
                return 1;
            } else {
                i++;
            }
        }
        return len1 > len2 ? 1: -1;
    }
}
