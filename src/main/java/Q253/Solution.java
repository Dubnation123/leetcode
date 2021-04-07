package Q253;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> queue = new PriorityQueue<>(Integer::compareTo);
        for (int i = 0; i < intervals.length; i++) {
            if (!queue.isEmpty() && intervals[i][0] >= queue.peek()) {
                queue.poll();
            }
            queue.add(intervals[i][1]);
        }
        return queue.size();
    }
}
