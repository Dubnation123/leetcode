package Q338;

public class Solution {
    public int[] countBits(int num) {
        int[] result = new int[num+1];
        for (int i = 1; i< num + 1; i++) {
           result[i] = result[i>>1] + (i % 2);
        }
        return result;
    }
}
