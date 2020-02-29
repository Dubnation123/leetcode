package Q654;

import java.util.Arrays;

public class Solution {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 0 ) {
            return null;
        } else if (nums.length == 1) {
            return new TreeNode(nums[0]);
        } else {
            int maxNum = Arrays.stream(nums).max().getAsInt();
            int maxIndex = getIndexOfLargest(nums);
            int[] leftNode = Arrays.copyOfRange(nums, 0, maxIndex);
            int[] rightNode = Arrays.copyOfRange(nums, maxIndex+1, nums.length);
            TreeNode result = new TreeNode(maxNum);
            result.left = constructMaximumBinaryTree(leftNode);
            result.right = constructMaximumBinaryTree(rightNode);
            return result;
        }
    }

    private int getIndexOfLargest( int[] array ){
        int largest = 0;
        for ( int i = 1; i < array.length; i++ ) {
            if ( array[i] > array[largest] ) largest = i;
        }
        return largest;
    }
}
