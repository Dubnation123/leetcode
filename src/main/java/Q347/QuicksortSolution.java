package Q347;

import java.util.*;

public class QuicksortSolution {

    Map<Integer, Integer> memo = new HashMap<>();

    public int[] topKFrequent(int[] nums, int k) {
        for (int num: nums) {
            memo.put(num, memo.getOrDefault(num, 0) + 1);
        }
        int[] candidates = memo.keySet().stream().mapToInt(Integer::intValue).toArray();
        int candidateLength = candidates.length;
        quickselect(0, candidateLength-1, candidateLength - k, candidates);
        return Arrays.copyOfRange(candidates, candidateLength -k , candidateLength);
    }

    public void quickselect(int startIdx, int endIdx, int k, int[] nums) {
        if (startIdx == endIdx) {
            return;
        } else {
            int store = partition(startIdx, endIdx, k, nums);
            if (store == k) {
                return;
            } else if (store > k) {
                quickselect(startIdx, store - 1, k, nums);
            } else {
                quickselect(store + 1, endIdx, k, nums);
            }
        }
    }


    public int partition(int startIdx, int endIdx, int k, int[] nums) {
        int storeIndex = startIdx;
        int storeValue = memo.get(nums[k]);
        swap(nums, k, endIdx);
        for (int i = startIdx; i < endIdx; i++) {
            if (memo.get(nums[i]) < storeValue) {
                swap(nums, i, storeIndex);
                storeIndex++;
            }
        }
        swap(nums, storeIndex, endIdx);
        return storeIndex;
    }

    private void swap(int[] nums, int idx1, int idx2) {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }
}
