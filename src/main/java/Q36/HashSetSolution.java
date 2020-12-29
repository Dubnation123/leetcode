package Q36;

import java.util.HashSet;
import java.util.Set;

public class HashSetSolution {
    public boolean isValidSudoku(char[][] board) {
        Set<Integer>[] rows = new HashSet[9];
        Set<Integer>[] columns = new HashSet[9];
        Set<Integer>[] cubes = new HashSet[9];
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<Integer>();
            columns[i] = new HashSet<Integer>();
            cubes[i] = new HashSet<Integer>();
        }

        for (int i = 0; i< 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int cube = (i/3) *3 + j /3;
                    int num = Character.getNumericValue(board[i][j]);
                    if (!rows[i].add(num)|| !columns[j].add(num) || !cubes[cube].add(num)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
