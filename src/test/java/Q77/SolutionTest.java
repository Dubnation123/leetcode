package Q77;

import org.junit.Test;

import java.util.List;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        List<List<Integer>> result = solution.combine(1,1);
    }

    @Test
    public void test2() {
        BacktrackingSolution solution = new BacktrackingSolution();
        List<List<Integer>> result = solution.combine(4,2);
    }

}