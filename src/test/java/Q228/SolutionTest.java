package Q228;

import org.junit.Test;

import java.util.List;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] input = new int[]{0};
        List<String> result = solution.summaryRanges(input);
    }

    @Test
    public void test2() {
        BetterSolution solution = new BetterSolution();
        int[] input = new int[]{0,1,2,4,5,7};
        List<String> result = solution.summaryRanges(input);
    }

}