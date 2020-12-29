package Q692;

import org.junit.Test;

import java.util.List;

public class SolutionTest {

    @Test
    public void topKFrequent() {
        Solution solution = new Solution();
        String[] input = new String[]{"i", "love", "leetcode", "i", "love", "coding"};
        List<String> result = solution.topKFrequent(input, 2);
    }
}