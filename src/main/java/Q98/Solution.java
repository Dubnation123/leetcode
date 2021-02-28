package Q98;

public class Solution {
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        return isValidBSTLeft(root.left, root.val) && isValidBSTRight(root.right, root.val);
    }

    public boolean isValidBSTLeft(TreeNode node, int val) {
        if (node == null) return true;
        int max = maxSubTreeVal(node);
        return max < val && isValidBSTLeft(node.left, node.val)
                && isValidBSTRight(node.right, node.val);

    }

    public boolean isValidBSTRight(TreeNode node, int val) {
        if (node == null) return true;
        int min = minSubTreeVal(node);
        return min > val && isValidBSTLeft(node.left, node.val)
                && isValidBSTRight(node.right, node.val);
    }

    private int maxSubTreeVal(TreeNode node) {
        return node.right == null? node.val : maxSubTreeVal(node.right);
    }

    private int minSubTreeVal(TreeNode node) {
        return node.left == null? node.val: minSubTreeVal(node.left);
    }
}
