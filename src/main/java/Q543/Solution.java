package Q543;

public class Solution {
    int result = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return result;
    }

    public int helper(TreeNode node) {
        if (node == null) return 0;
        int left = helper(node.left);
        int right = helper(node.right);
        result = Math.max(result, 1 + left + right);
        return 1 + Math.max(left, right);
    }
}
