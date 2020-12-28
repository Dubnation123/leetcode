package Q347;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void topKFrequent() {
        Solution solution  = new Solution();
        int[] input = new int[]{1};
        int[] result = solution.topKFrequent(input,1);
    }

    @Test
    public void testQuickSelectSolution() {
        QuicksortSolution solution = new QuicksortSolution();
        int[] input = new int[]{1,1,2,2,3,3,3,4};
        int[] result = solution.topKFrequent(input, 3);
    }
}