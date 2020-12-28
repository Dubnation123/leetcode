package Q974;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {

    @Test
    public void subarraysDivByK() {
        Solution1 solution1 = new Solution1();
        int[] input = new int[]{4,5,0,-2,-3,1};
        int result = solution1.subarraysDivByK(input, 5);
    }
}