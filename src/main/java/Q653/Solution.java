package Q653;

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<Integer> flatTree = new ArrayList<Integer>();
    public boolean findTarget(TreeNode root, int k) {
        inOrderTraverse(root);
        for (int i = 0; i < flatTree.size(); i++) {
            for (int j = i+1; j< flatTree.size(); j++) {
                 if (flatTree.get(i) + flatTree.get(j) == k) return true;
            }
        }
        return false;
    }

    private void inOrderTraverse(TreeNode node) {
        if (node == null) return;
        inOrderTraverse(node.left);
        flatTree.add(node.val);
        inOrderTraverse(node.right);
    }
}
