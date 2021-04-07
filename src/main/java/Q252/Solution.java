package Q252;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        if (intervals.length == 0) return true;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        for (int i = 1; i < intervals.length; i++) {
            boolean canAttend = intervals[i][0] >= intervals[i-1][1];
            if (!canAttend) return false;
        }
        return true;
    }
}
