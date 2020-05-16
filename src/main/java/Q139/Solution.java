package Q139;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Map<Integer, List<String>> dictByLength = wordDict.stream()
                .collect(groupingBy(String::length));
        boolean[] result = new boolean[s.length()+1];
        result[0] = true;

        for (int i = 1; i < s.length() + 1; i++) {
            for (Map.Entry<Integer, List<String>> entry: dictByLength.entrySet()) {
                if (i - entry.getKey() >= 0) {
                    int finalI = i;
                    if (result[i-entry.getKey()] &&
                            entry.getValue().stream().anyMatch(w -> s.substring(finalI -entry.getKey(), finalI).equals(w))) {
                        result[i] = true;
                        break;
                    }
                }
            }
        }
        return result[s.length()];
    }
}
