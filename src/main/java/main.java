import Q54.Solution;

import java.util.List;

public class main {
    public static void main(String arg[]) {
        int[][] input = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        Solution solution = new Solution();
        List<Integer> result= solution.spiralOrder(input);
    }
}
