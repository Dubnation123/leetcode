package Q692;

import java.util.*;

public class Solution {
    Map<String, Integer> memo = new HashMap<>();

    public List<String> topKFrequent(String[] words, int k) {
        for (String word: words) {
            memo.put(word, memo.getOrDefault(word, 0) + 1);
        }
        String[] candidates = memo.keySet().toArray(new String[0]);
        quickSort(0, candidates.length-1, candidates.length-1, candidates);
        return Arrays.asList(Arrays.copyOfRange(candidates, 0, k));
    }

    private void quickSort(int startIdx, int endIdx, int k, String[] candidates) {
        if (startIdx >= endIdx) return;
        int storeIdx = partition(startIdx, endIdx, k, candidates);
        quickSort(startIdx, storeIdx-1, storeIdx-1, candidates);
        quickSort(storeIdx+1, endIdx, endIdx, candidates);
    }

    private int partition(int startIdx, int endIdx, int k, String[] candidates) {
        int storeIndex = startIdx;
        String storeValue = candidates[k];
        swap(k, endIdx, candidates);
        for (int i = startIdx; i < endIdx; i++) {
            if (compareValue(candidates[i], storeValue)) {
                swap(i , storeIndex, candidates);
                storeIndex++;
            }
        }
        swap(storeIndex, endIdx, candidates);
        return storeIndex;
    }

    private boolean compareValue(String s1, String s2) {
        if (memo.get(s1) > memo.get(s2)) {
            return true;
        } else return memo.get(s1).equals(memo.get(s2)) && s1.compareTo(s2) < 0;
    }


    private <K> void swap(int index1, int index2, K[] candidates) {
        K temp = candidates[index1];
        candidates[index1] = candidates[index2];
        candidates[index2] = temp;
    }
}
