package Q993;

public class DFSSolution {
    TreeNode xParent = null;
    TreeNode yParent = null;
    int xDepth = -1, yDepth = -1;

    public boolean isCousins(TreeNode root, int x, int y) {
        getDepthAndParent(root, x, y, 0, null);
        return xDepth == yDepth && xParent != yParent? true: false;
    }

    private void getDepthAndParent(TreeNode root, int x, int y, int depth, TreeNode parent) {
        if (root == null) return;
        if (root.val == x) {
            xParent = parent;
            xDepth = depth;
        } else if (root.val == y) {
            yParent = parent;
            yDepth = depth;
        }  else {
            getDepthAndParent(root.left, x, y, depth + 1, root);
            getDepthAndParent(root.right, x, y, depth + 1, root);
        }

    }
}
