package Q256;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void test1() {
        int[][] input = new int[][]{{17,2,17},{16,16,5},{14,3,19}};
        int result = solution.minCost(input);
        assertEquals(10, result);
    }

    @Test
    public void test2() {
        int[][] input = new int[][]{{7,6,2},{16,16,5},{14,3,19}};
        int result = solution.minCost(input);
        assertEquals(14, result);
    }

    @Test
    public void test3() {
        int[][] input = new int[][]{{3,5,3},{6,17,6},{7,13,18}, {9,10,18}};
        int result = solution.minCost(input);
        assertEquals(14, result);
    }
}