package MergeSort;

import org.junit.Test;

import java.util.List;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        List<Integer> input = List.of(1,6,3,6,4,2,7,4,2,6,9);
        List<Integer> result  = solution.mergeSort(input);
    }
}