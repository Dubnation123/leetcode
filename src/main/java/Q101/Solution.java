package Q101;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        else return equals(root.left, root.right);
    }

    public boolean equals(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) return true;
        if (node1 == null || node2 == null) {return false;}
        return node1.val == node2.val && equals(node1.left, node2.right) && equals(node1.right, node2.left);
    }
}
