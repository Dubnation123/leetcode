package Q56;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 1) return intervals;
        LinkedList<int[]> result = new LinkedList<>();
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        for (int[] interval: intervals) {
            if (result.isEmpty() || interval[0] > result.getLast()[1]) {
                result.addLast(interval);
            } else {
                result.getLast()[1] = Math.max(result.getLast()[1], interval[1]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
