package Q199;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue1 = new ArrayDeque<>();
        queue1.add(root);
        int currentSize = 1;
        int nextSize = 0;
        while (!queue1.isEmpty()) {
            TreeNode node = queue1.poll();
            currentSize--;
            if (node.left != null) queue1.add(node.left); nextSize++;
            if (node.right != null) queue1.add(node.right); nextSize++;
            if (currentSize == 0) {
                result.add(node.val);
                currentSize = nextSize;
                nextSize = 0;
            }
        }
        return result;
    }
}
