package Q136;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> uniqueNumber = new HashSet<>();
        for (int num: nums) {
            if (uniqueNumber.contains(num)) {uniqueNumber.remove(num);} else {uniqueNumber.add(num);}
        }
        return (int) uniqueNumber.toArray()[0];
    }
}
