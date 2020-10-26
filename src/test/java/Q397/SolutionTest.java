package Q397;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SolutionTest {
    Solution1 solution = new Solution1();

    @Test
    public void test1() {
        int result = solution.integerReplacement(65535);
        assertEquals(17, result);
    }
}