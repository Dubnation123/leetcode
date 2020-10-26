package Q628;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void test1() {
        int[] input = new int[]{2,4,5,6,7,8};
        int result = solution.maximumProduct(input);
        assertEquals(336, result);
    }

    @Test
    public void test2() {
        int[] input = new int[]{-12,4,5,6,7,8};
        int result = solution.maximumProduct(input);
        assertEquals(336, result);
    }

    @Test
    public void test3() {
        int[] input = new int[]{-12,-8,5,6,7,8};
        int result = solution.maximumProduct(input);
        assertEquals(768, result);
    }
}
