package Q739;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void dailyTemperatures() {
        Solution solution = new Solution();
        int[] input = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = solution.dailyTemperatures(input);
    }
}