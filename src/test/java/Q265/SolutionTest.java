package Q265;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void sortIndexTest() {
        int[] input = new int[]{1,5,7,23,2,6};
        int[] result = solution.sortIndex(input);
        int[] expected = new int[]{0,4,1,5,2,3};
        assertArrayEquals(expected, result);
    }

    @Test
    public void minCostTest() {
        int[][] input = new int[][]{{15,17,15,20,7,16,6,10,4,20,7,3,4},{11,3,9,13,7,12,6,7,5,1,7,18,9}};
        int result = solution.minCostII(input);
    }
}