package Q236;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<TreeNode> linkP = new LinkedList<>();
    List<TreeNode> linkQ = new LinkedList<>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        helper(root, p, q, new LinkedList<>());
        int i;
        for (i=0; i< Math.min(linkP.size(), linkQ.size()); i++) {
            if (linkP.get(i) != linkP.get(i)) {
                return linkQ.get(i-1);
            }
        }
        return linkP.get(i);
    }

    public void helper(TreeNode root, TreeNode p, TreeNode q, List<TreeNode> list) {
        if (root == null) return;
        list.add(root);
        if (root == p) {
            linkP = new LinkedList<>(list);
        } else if (root == q) {
            linkQ = new LinkedList<>(list);
        } else {
            helper(root.left, p, q, list);
            helper(root.right, p, q, list);
        }
    }
}
