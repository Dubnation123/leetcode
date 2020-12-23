package Q39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        combSum(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    public void combSum(int[] candidates, int target, int start, List<Integer> curr, List<List<Integer>> result) {
        for (int i = start; i< candidates.length; i++) {
            curr.add(candidates[i]);
            if (target - candidates[i] == 0) {
                result.add(List.copyOf(curr));
                curr.remove(curr.size()-1);
                return;
            } else if (target - candidates[i] < 0) {
                curr.remove(curr.size()-1);
                break;
            } else {
                combSum(candidates, target- candidates[i], i, curr, result);
                curr.remove(curr.size()-1);
            }
        }
    }
}
