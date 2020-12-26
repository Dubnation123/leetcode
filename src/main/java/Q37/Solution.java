package Q37;

import java.util.Arrays;

public class Solution {
    char[][] board;
    char[][] solutionBoard = new char[9][9];

    public void solveSudoku(char[][] board) {
        this.board = board;
        helper(0,0);
        board = solutionBoard;
        System.out.print(Arrays.deepToString(board));
    }

    private void helper(int currRow, int currColumn) {
        if (currRow == 0 && currColumn == 9) {
            for (int i = 0; i < 9; i++) {
                solutionBoard[i] = Arrays.copyOf(board[i], board[i].length);
            }
            return;
        } else {
            int nextRow = currRow % 9 == 8 ? 0: currRow+1;
            int nextColumn =  currRow % 9 == 8? currColumn+1: currColumn;
            if (board[currRow][currColumn] == '.') {
                for (int fill = 1; fill < 10; fill++) {
                    if (isSafe(currRow, currColumn, fill)) {
                        board[currRow][currColumn] = (char) (fill+'0');
                        helper(nextRow, nextColumn);
                        board[currRow][currColumn] = '.';
                    }
                }
                return;
            } else {
                helper(nextRow, nextColumn);
            }
        }
    }

    private boolean isSafe(int row, int column, int num) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] != '.' && Character.getNumericValue(board[row][i]) == num) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (board[i][column] != '.' && Character.getNumericValue(board[i][column]) == num) {
                return false;
            }
        }
        for (int i = (row/3)*3; i < (row/3+1) *3; i++) {
            for (int j = (column/3)*3; j < (column/3+1) * 3; j++) {
                if (board[i][j] != '.' && Character.getNumericValue(board[i][j]) == num) {
                    return false;
                }
            }
        }
        return true;
    }
}
