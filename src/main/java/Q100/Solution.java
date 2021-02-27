package Q100;

public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p!= null && q!=null) {
            return isSameTree(p.left, q.left) && p.val == q.val && isSameTree(p.right, q.right);
        }
        return false;
    }
}
