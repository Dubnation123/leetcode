package Q3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void lengthOfLongestSubstring() {
        Solution solution = new Solution();
        int result = solution.lengthOfLongestSubstring(" ");
    }

    @Test
    public void test2() {
        SlidingWindowSolution solution = new SlidingWindowSolution();
        int result = solution.lengthOfLongestSubstring("pwwkew");
    }

}