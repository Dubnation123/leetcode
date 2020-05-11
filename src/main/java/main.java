import Q85.DpMaximumHeightSolution;

public class main {
    public static void main(String arg[]) {
        DpMaximumHeightSolution solution = new DpMaximumHeightSolution();
        char[][] input = new char[][] {{'0','1','1','0','1'}, {'1','1', '0', '1', '0'},
                {'0', '1', '1', '1', '0'}, {'1', '1', '1', '1', '0'},
                {'1', '1', '1', '1', '1'}, {'0', '0', '0', '0', '0'}};
        int editDistance = solution.maximalRectangle(input);
    }
}
