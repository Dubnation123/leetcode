package Q560;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void subarraySum() {
        Solution solution = new Solution();
        int[] input = new int[]{1,1,1};
        int result = solution.subarraySum(input, 3);
    }

    @Test
    public void subarraySum2() {
        Solution solution = new Solution();
        int[] input = new int[]{1,2,3};
        int result = solution.subarraySum(input, 3);
    }

    @Test
    public void subarraySum3() {
        HashMapSolution solution = new HashMapSolution();
        int[] input = new int[]{1,2,3};
        int result = solution.subarraySum(input, 3);
    }
}