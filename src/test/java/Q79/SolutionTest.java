package Q79;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void exist() {
        Solution solution = new Solution();
        char[][] input = new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        boolean result = solution.exist(input, "ABCB");
    }

    @Test
    public void exist1() {
        Solution solution = new Solution();
        char[][] input = new char[][]{{'A'}};
        boolean result = solution.exist(input, "A");
    }
}