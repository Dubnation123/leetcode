package Q79;

public class Solution {
    boolean exists = false;
    int row;
    int column;

    public boolean exist(char[][] board, String word) {
        row = board.length;
        column = board[0].length;
        boolean[][] placeHolder = new boolean[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (helper(i, j, board, placeHolder, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean helper(int currRow, int currColumn, char[][] board, boolean[][] placeHolder, String word) {
        if (word.length() == 0) {
            return true;
        } else if (currRow <0 || currRow == row || currColumn < 0 || currColumn == column ||
                board[currRow][currColumn] != word.charAt(0) || placeHolder[currRow][currColumn]) {
            return false;
        } else {
            placeHolder[currRow][currColumn] = true;
            boolean ret = false;
            int[] rowOffsets = {0, 1, 0, -1};
            int[] colOffsets = {1, 0, -1, 0};
            for (int d = 0; d < 4; ++d) {
                ret = helper(currRow + rowOffsets[d], currColumn + colOffsets[d], board, placeHolder, word.substring(1));
                if (ret) {
                    break;
                }
            }
            placeHolder[currRow][currColumn] = false;
            return ret;
        }
    }
}
