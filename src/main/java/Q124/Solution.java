package Q124;

public class Solution {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if (root == null) return 0;
        helper(root);
        return max;
    }

    public int helper(TreeNode node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) {
            max = Math.max(max, node.val);
            return node.val;
        }
        int leftValue = Math.max(helper(node.left), 0);
        int rightValue = Math.max(helper(node.right), 0);
        max = Math.max(max, leftValue + rightValue + node.val);
        return Math.max(leftValue, rightValue) + node.val;
    }
}
