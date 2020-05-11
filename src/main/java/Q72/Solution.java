package Q72;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

public class Solution {
    class Result {
        int x;
        int y;
        int editDistance;
    }
    public int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();

        Set<Character> set1 = word1.chars().mapToObj( i -> (char)i).collect(toSet());
        Set<Character> set2 = word2.chars().mapToObj( i -> (char)i).collect(toSet());
        set1.retainAll(set2);
        if (len1 == 0 || len2 == 0 || set1.size() == 0) {
            return Math.max(len1, len2);
        }

        List<Result> results = new ArrayList<>();

        for (int i = 0; i < len1; i++) {
            for (int j = 0; j< len2; j++) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    Result result = new Result();
                    result.x = i;
                    result.y = j;
                    int localMin = Math.max(i,j);
                    for (int k = 0; k < results.size(); k++) {
                        if (results.get(k).x < i && results.get(k).y < j) {
                            int localED = results.get(k).editDistance + Math.max(i - results.get(k).x -1, j - results.get(k).y -1);
                            localMin = Math.min(localMin, localED);
                        }
                    }
                    result.editDistance = localMin;
                    results.add(result);
                }
            }
        }
        results.stream().forEach(r -> r.editDistance = r.editDistance + Math.max(len1 -1- r.x, len2 -1 - r.y));
        return results.stream().map(r -> r.editDistance).min(Integer::compare).get();
    }
}
