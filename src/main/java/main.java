import Q939.Solution1;

public class main {
    public static void main(String arg[]) {
        int[][] input = new int[][]{{1,1},{1,3},{3,1},{3,3},{4,1},{4,3}};
        Solution1 solution = new Solution1();
        int result = solution.minAreaRect(input);
    }
}
