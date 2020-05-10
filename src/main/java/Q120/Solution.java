package Q120;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.size() == 0) {return 0;}
        int[][] result = new int[triangle.size()][triangle.size()];
        for (int i = 0; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                if (i == 0) {
                    result[i][j] = triangle.get(i).get(j);
                } else {
                    if (j == 0) {
                        result[i][j] = result[i-1][j] + triangle.get(i).get(j);
                    } else if (j ==  triangle.get(i).size() -1){
                        result[i][j] = result[i-1][j-1] + triangle.get(i).get(j);
                    }else {
                        result[i][j] = Math.min(result[i-1][j-1], result[i-1][j]) + triangle.get(i).get(j);
                    }
                }
            }
        }
        Arrays.sort(result[triangle.size()-1]);
        return result[triangle.size()-1][0];
    }
}
