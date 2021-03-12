package Q11;

public class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i< height.length; i++) {
            for (int j = height.length -1; j > i; j--) {
                if (height[j] >= height[i]) {
                    max = Math.max(max, height[i] * (j-1));
                    break;
                }
                max = Math.max(max, height[i] * (j-1));
            }
        }
        return max;
    }
}
