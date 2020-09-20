package Q351;

import java.util.*;

// This method is correct for sure, but just the run time is too long
public class Solution {
    public int numberOfPatterns(int m, int n) {
        final Map<Integer, Integer> checkMap = Map.of(13,2,46,5,79,8,17,4,28,5,39,6,19,5,37,5);
        Map<Integer, List<List<Integer>>> result = new HashMap<>();
        result.put(1, new ArrayList<>());

        for (int i = 1; i < 10; i++) {
            result.get(1).add(List.of(i));
        }

        for (int i = 2; i< 10; i++) {
            result.put(i, new ArrayList<>());
            for (List<Integer> candidate: result.get(i-1)) {
                for (int j = 1; j < 10; j++) {
                    if (!candidate.contains(j)) {
                        int lastNum = candidate.get(candidate.size()-1);
                        int small = Math.min(lastNum, j);
                        int large = Math.max(lastNum,j);
                        if (!checkMap.containsKey(small * 10 + large)) {
                            result.get(i).add(addTo(candidate,j));
                        } else {
                            if (candidate.contains(checkMap.get(small * 10 + large))) {
                                result.get(i).add(addTo(candidate,j));
                            }
                        }
                    }
                }
            }
        }

        int resultInt = 0;
        for (int i = m; i <= n; i++) {
            resultInt += result.get(i).size();
        }
        return resultInt;
    }

    private List<Integer> addTo(List<Integer> ori, Integer to) {
        List<Integer> temp = new ArrayList<>(ori);
        temp.add(to);
        return temp;
    }
}
