package Q120;

//Going from bottom to up saves us from the trouble of Min/Max index discussion

import java.util.List;

public class DpSolution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] A = new int[triangle.size()];
        for (int j = 0; j < triangle.size(); j++) {
            A[j] = triangle.get(triangle.size()-1).get(j);
        }
        for(int i=triangle.size()-2;i>=0;i--){
            for(int j=0;j<triangle.get(i).size();j++){
                A[j] = Math.min(A[j],A[j+1])+triangle.get(i).get(j);
            }
        }
        return A[0];
    }
}
