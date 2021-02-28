package Q257;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<String> result = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return result;
        helper(root, "");
        return result;
    }

    private void helper(TreeNode node, String path) {
        if (node != null) {
            path += node.val;
        }
        if (node.left == null && node.right == null) {
            result.add(path);
            return;
        }
        path += "->";
        if (node.left != null) {
            helper(node.left, path);
        }
        if (node.right != null) {
            helper(node.right, path);
        }
    }
}
