package Q867;

public class Solution {
    public int[][] transpose(int[][] A) {
        int row;
        row = A.length;
        int column = A[0].length;
        int[][] B = new int[column][row];
        for (int i = 0; i < row; i ++) {
            for (int j = 0; j < column; j++) {
                B[j][i] = A[i][j];
            }
        }
        return B;
    }
}
