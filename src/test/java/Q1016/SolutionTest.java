package Q1016;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void test1() {
        String input1 = "0110";
        Integer input2 = 3;
        boolean result = solution.queryString(input1, input2);
        assertTrue(result);
    }

    @Test
    public void test2() {
        String input1 = "1";
        Integer input2 = 1;
        boolean result = solution.queryString(input1, input2);
        assertTrue(result);
    }
}
