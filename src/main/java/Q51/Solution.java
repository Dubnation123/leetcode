package Q51;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        return Collections.emptyList();
    }

    private void solveQueen(int n, int count, List<String> curr, List<List<String>> result) {
        if (count > n) {
            result.add(List.copyOf(curr));
            return;
        } else {
            for (int i = count; i < n; i++) {
                for (int row = 0; row < n; row++) {

                }
            }
        }
    }
}
