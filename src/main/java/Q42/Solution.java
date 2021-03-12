package Q42;

import java.util.Arrays;

public class Solution {
    public int trap(int[] height) {
        int result = 0;
        for (int i = 0; i < height.length; i++) {
            int j = i -1;
            if (j < 0 || height[j] >= height[i]) {}
            else {
                while (j >=0) {
                    if (height[j] <= height[j+1]) {
                        j--;
                    } else {
                        result += (i-j-1) *
                                (Math.min(height[j], height[i])  - Math.max(height[i-1], height[j+1]));
                        Arrays.fill(height, j+1, i, Math.min(height[j], height[i]));
                        j--;
                    }
                }
            }
        }
        return result;
    }
}
