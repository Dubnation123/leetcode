package Q953;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isAlienSorted() {
        Solution solution = new Solution();
        String[] input1 = new String[]{"hello","leetcode"};
        String input2 = "hlabcdefgijkmnopqrstuvwxyz";
        boolean result = solution.isAlienSorted(input1, input2);
    }

    @Test
    public void isAlienSorted2() {
        Solution solution = new Solution();
        String[] input1 = new String[]{"word","word","row"};
        String input2 = "worldabcefghijkmnpqstuvxyz";
        boolean result = solution.isAlienSorted(input1, input2);
    }

    @Test
    public void isAlienSorted3() {
        Solution solution = new Solution();
        String[] input1 = new String[]{"apple","app"};
        String input2 = "abcdefghijklmnopqrstuvwxyz";
        boolean result = solution.isAlienSorted(input1, input2);
    }
}