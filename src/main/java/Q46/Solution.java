//package Q46;
//
//import java.util.*;
//
//public class Solution {
//    int[] nums;
//    int length;
//
//    public List<List<Integer>> permute(int[] nums) {
//        this.nums = nums;
//        this.length = nums.length;
//        List<List<Integer>> result = new LinkedList<>();
//        boolean[] placeHolder = new boolean[nums.length];
//        for (int i = 0; i < length; i++) {
//            helper(placeHolder, i, result, new ArrayList<>());
//
//        }
//        return result;
//    }
//
//    private void helper(boolean[] placeHolder, int index, List<List<Integer>> result, List<Integer> curr) {
//        if (curr.size() == length -1  && !placeHolder[index]) {
//            curr.add()
//            result.add(List.copyOf(curr));
//            return;
//        } else if (placeHolder[index]){
//            return;
//        } else {
//            placeHolder[index] = true;
//            curr.add(nums[index]);
//            for (int i = 0; i < length; i++) {
//                helper(placeHolder, i, result, curr);
//            }
//            placeHolder[index] = false;
//            curr.remove(curr.size() -1);
//        }
//    }
//}
