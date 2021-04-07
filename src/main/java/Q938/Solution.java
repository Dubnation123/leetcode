package Q938;

public class Solution {
    int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        traverse(root, low, high);
        return sum;
    }

    private void traverse(TreeNode node, int low, int high) {
        if (node == null) return;
        if (node.val < low) {
            traverse(node.left, low, high);
        } else if (node.val > high) {
            traverse(node.right, low, high);
        } else {
            sum += node.val;
            traverse(node.left, low, high);
            traverse(node.right, low, high);
        }
    }
}
