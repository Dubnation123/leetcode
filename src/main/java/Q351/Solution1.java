package Q351;

import java.util.Map;

public class Solution1 {
    final Map<Integer, Integer> checkMap = Map.of(13, 2, 46, 5, 79, 8, 17, 4, 28, 5, 39, 6, 19, 5, 37, 5);

    public int numberOfPatterns(int m, int n) {
        int[] result = new int[9];
        boolean[] visited = new boolean[9];
        for (int i = 0; i< 9; i++) {
            helper(visited, 1, result, i,i);
        }
        int finalR = 0;
        for (int i = m; i <=n; i++) {
            finalR += result[i-1];
        }
        return finalR;
    }

    private void helper(boolean[] visited, int count, int[] result, int start, int end) {
        if (visited[end] || !okayPath(start, end, visited) || count > 2) return;
        else {
            visited[end] = true;
            System.out.print("\t".repeat(count) + "from " + (start+1) + "to " + (end+1) + "\n");
            result[count-1]++;
            for (int i = 0; i < 9; i++) {
                helper(visited, count+1, result, end, i);
            }
            visited[end] = false;
        }
    }

    private boolean okayPath(int start, int end, boolean[] visited) {
        Integer key = (Math.min(start, end) +1 ) * 10 + Math.max(start, end) + 1;
        return !checkMap.containsKey(key) || visited[checkMap.get(key)-1];
    }
}
