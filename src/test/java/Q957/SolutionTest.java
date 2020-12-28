package Q957;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void prisonAfterNDays() {
        Solution solution = new Solution();
        int[] input = new int[]{0,1,0,1,1,0,0,1};
        int[] result = solution.prisonAfterNDays(input, 20);
    }
}