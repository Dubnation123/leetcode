package Q49;

import org.junit.Test;

import java.util.List;

public class SolutionTest {

    @Test
    public void groupAnagrams() {
        Solution solution = new Solution();
        String[] input = new String[]{"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = solution.groupAnagrams(input);
    }

    @Test
    public void groupAnagrams1() {
        Solution solution = new Solution();
        String[] input = new String[]{"a"};
        List<List<String>> result = solution.groupAnagrams(input);
    }
}