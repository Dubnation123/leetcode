package Q347;

import java.util.*;

import static java.util.stream.Collectors.toList;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> memo = new HashMap<>();
        for (int num: nums) {
            int temp = memo.getOrDefault(num, 0) + 1;
            memo.put(num, temp);
        }
        List<Integer> times = new ArrayList<>(memo.values());
        List<Integer> has = times.stream().sorted(Comparator.reverseOrder()).collect(toList()).subList(0,k);
        List<Integer> result =  memo.entrySet().stream().filter((entry) -> has.contains(entry.getValue()))
                .map(Map.Entry::getKey).collect(toList());
        return toIntArray(result);
    }

    int[] toIntArray(List<Integer> list){
        int[] ret = new int[list.size()];
        for(int i = 0;i < ret.length;i++)
            ret[i] = list.get(i);
        return ret;
    }
}
