package Q216;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        combinationSumHelper(1, k, n, new ArrayList<>(), result);
        return result;
    }

    private void combinationSumHelper(int start, int num, int target, List<Integer> curr, List<List<Integer>> result) {
        if (target == 0 && num == 0) {
            result.add(List.copyOf(curr));
            return;
        } else if (target < 0 || num <= 0) {
            return;
        } else {
            for (int i = start; i <10; i++) {
                curr.add(i);
                combinationSumHelper(i+1, num-1, target-i, curr, result);
                curr.remove(curr.size()-1);
            }
        }
    }
}
