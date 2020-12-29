package Q36;

public class Solution {
    char[][] board;
    public boolean isValidSudoku(char[][] board) {
        this.board = board;
        for (int i = 0; i< 9; i++) {
            for (int j = 0; j< 9; j++) {
                if (board[i][j] != '.') {
                    boolean result = isSafe(i, j);
                    if (!result) return false;
                }
            }
        }
        return true;
    }

    private boolean isSafe(int row, int column) {
        int num = Character.getNumericValue(board[row][column]);
        for (int i = 0; i < 9; i++) {
            if (board[row][i] != '.' && i != column && Character.getNumericValue(board[row][i]) == num) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (board[i][column] != '.' && i != row && Character.getNumericValue(board[i][column]) == num) {
                return false;
            }
        }
        for (int i = (row/3)*3; i < (row/3+1) *3; i++) {
            for (int j = (column/3)*3; j < (column/3+1) * 3; j++) {
                if (board[i][j] != '.' && i!= row && j!=column && Character.getNumericValue(board[i][j]) == num) {
                    return false;
                }
            }
        }
        return true;
    }
}
