package Q39;

import org.junit.Test;

import java.util.List;

public class SolutionTest {

    @Test
    public void test() {
        Solution solution = new Solution();
        int[] input = new int[]{2};
        List<List<Integer>> result = solution.combinationSum(input,7);
    }

}