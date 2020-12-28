package Q957;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        int[] nextCells = new int[cells.length];
        Map<Integer, Integer> seen = new HashMap();
        for (int i = 1; i<=N; i++) {
            int seeSee = 0;
            for (int j = 1; j< cells.length-1; j++) {
                nextCells[j] = cells[j-1] ^ cells[j+1];
                seeSee += nextCells[j] * Math.pow(10, j-1);
            }
            if (seen.containsKey(seeSee)) {
                int init = seen.get(seeSee);
                int period = i - init;
                int day = seen.entrySet().stream().filter(e -> e.getValue() == init + (N - init) % period).map(Map.Entry::getKey).findAny().orElse(0);
                return convertToArray(day);
            } else{
                seen.put(seeSee, i);
            }
            cells = nextCells.clone();
            Arrays.fill(nextCells, 0);
        }
        return cells;
    }

    private int[] convertToArray(int n) {
        int[] result = new int[8];
        int i = 1;
        while (n > 0) {
            result[i] = n % 10;
            n = n /10;
            i++;
        }
        return result;
    }
}
