package Q103;

import java.util.*;

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return Collections.emptyList();
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        boolean ltr = true;
        while (!queue.isEmpty()) {
            List<Integer> temp = new LinkedList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                if (ltr) {
                    TreeNode node = queue.removeFirst();
                    temp.add(node.val);
                    if (node.left!= null) queue.addLast(node.left);
                    if (node.right!= null) queue.addLast(node.right);
                }
                else {
                    TreeNode node = queue.removeLast();
                    temp.add(node.val);
                    if (node.right!=null) queue.addFirst(node.right);
                    if (node.left!=null) queue.addFirst(node.left);
                }
            }
            result.add(temp);
            ltr = !ltr;
        }
        return result;
    }
}
