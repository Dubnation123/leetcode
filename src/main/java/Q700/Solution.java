package Q700;




public class Solution {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode node = root;
        while(node != null) {
            if (node.val > val) node = node.left;
            else if (node.val < val) node = node.right;
            else return node;
        }
        return null;
    }
}