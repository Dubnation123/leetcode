package Q347;

import java.util.*;

public class HeapSolution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> memo = new HashMap<>();
        for (int num: nums) {
            memo.put(num, memo.getOrDefault(num, 0) + 1);
        }

        Queue<Integer> heap = new PriorityQueue<>(Comparator.comparingInt(memo::get));

        for (int n: memo.keySet()) {
            heap.add(n);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        int[] top = new int[k];
        for(int i = k - 1; i >= 0; --i) {
            top[i] = heap.poll();
        }
        return top;
    }
}
