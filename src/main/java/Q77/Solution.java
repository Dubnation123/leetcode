package Q77;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        return combinationInside(n, k);
    }

    private List<List<Integer>> combinationInside(int n, int k) {
        if (k == 0 || k > n) {
            List<List<Integer>> temp = new ArrayList<>();
            temp.add(new ArrayList<>());
            return temp;
        } else if (n == k) {
            List<Integer> temp = IntStream.range(1, n+1).boxed().collect(toList());
            return List.of(temp);
        } else {
                List<List<Integer>> withN = combinationInside(n-1, k-1);
                withN.stream().forEach(list -> list.add(n));
                List<List<Integer>> withoutN = combinationInside(n-1, k);
                return Stream.concat(withN.stream(), withoutN.stream()).collect(toList());
            }
        }
}
