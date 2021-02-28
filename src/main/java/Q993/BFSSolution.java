package Q993;

import java.util.ArrayDeque;
import java.util.Deque;

public class BFSSolution {

    public boolean isCousins(TreeNode root, int x, int y) {
        Deque<TreeNode> nodes = new ArrayDeque<>();
        Deque<TreeNode> parents = new ArrayDeque<>();
        nodes.add(root);
        parents.add(null);

        while (!nodes.isEmpty()) {
            int size = nodes.size();
            boolean xExists = false;
            boolean yExists = false;
            TreeNode xParents = null;
            TreeNode yParents = null;

            for (int i = 0; i < size; i++) {
                TreeNode node = nodes.poll();
                TreeNode parent = parents.poll();
                if (node.val == x) {
                    xExists = true;
                    xParents = parent;
                }
                if (node.val == y) {
                    yExists = true;
                    yParents = parent;
                }
                if (node.left != null) {
                    nodes.add(node.left);
                    parents.add(node);
                }
                if (node.right != null) {
                    nodes.add(node.right);
                    parents.add(node);
                }
            }

            if (xExists && yExists) return xParents != yParents;
            if (xExists || yExists) return false;
        }
        return false;
    }
}
