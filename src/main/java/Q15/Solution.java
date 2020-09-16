package Q15;

import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Key: value || Value: count
        Map<Integer, Integer> oneNum = new HashMap<>();
        Set<List<Integer>> result = new HashSet<>();
        if (nums.length < 3) {
            return Collections.emptyList();
        } else {
            for (int i = 0; i < nums.length; i++) {
                int count = oneNum.getOrDefault(nums[i], 0);
                oneNum.put(nums[i], count+1);
            }
            for (Map.Entry<Integer, Integer> entry: oneNum.entrySet()) {
                int firstNum = entry.getKey();
                for (Map.Entry<Integer, Integer> entry1: oneNum.entrySet()) {
                    if (entry1.getKey()!=firstNum || entry1.getValue()>1) {
                        int secondNum = entry1.getKey();
                        int thirdNum = -firstNum-secondNum;
                        if (firstNum == 0 && secondNum == 0) {
                            if (entry.getValue() > 2) {
                                result.add(List.of(0,0,0));
                            }
                        } else if (thirdNum == firstNum || thirdNum == secondNum) {
                            if (oneNum.containsKey(thirdNum) && oneNum.get(thirdNum) > 1) {
                                List<Integer> localResult = new ArrayList<>(List.of(firstNum, secondNum, thirdNum));
                                localResult.sort(Integer::compareTo);
                                result.add(localResult);
                            }
                        } else {
                            if (oneNum.containsKey(thirdNum)) {
                                List<Integer> localResult = new ArrayList<>(List.of(firstNum, secondNum, thirdNum));
                                localResult.sort(Integer::compareTo);
                                result.add(localResult);
                            }
                        }
                    }
                }
            }
            return new ArrayList<>(result);
        }
    }
}
