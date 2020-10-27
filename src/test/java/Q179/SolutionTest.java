package Q179;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void test1() {
        String input1 = "69";
        String input2 = "691";

        int result = solution.comparator(input1, input2);
        assertEquals(-1,result);
    }

    @Test
    public void test2() {
        String input1 = "69";
        String input2 = "6969";

        int result = solution.comparator(input1, input2);

        assertEquals(0,result);
    }

    @Test
    public void test3() {
        String input1 = "69";
        String input2 = "696929";

        int result = solution.comparator(input1, input2);
        assertEquals(-1,result);
    }

    @Test
    public void test4() {
        String input1 = "69";
        String input2 = "6991";

        int result = solution.comparator(input1, input2);
        assertEquals(1,result);
    }

    @Test
    public void test5() {
        int[] input = new int[]{3,30,34,5,9};
        String result = solution.largestNumber(input);
        assertEquals("9534330",result);
    }

    @Test
    public void test6() {
        int[] input = new int[]{0,0,0};
        String result = solution.largestNumber(input);
        assertEquals("0",result);
    }
}
