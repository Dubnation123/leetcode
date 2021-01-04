package Q18;

import org.junit.Test;

import java.util.List;

public class GeneralizedSolutionTest {

    @Test
    public void fourSum() {
        GeneralizedSolution solution = new GeneralizedSolution();
        int[] input = new int[]{1,0,-1,0,-2,2};
        List<List<Integer>> result = solution.fourSum(input, 0);
    }
}