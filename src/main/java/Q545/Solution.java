package Q545;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<Integer> result = new LinkedList<>();
    List<Integer> leftBoundary = new LinkedList<>();
    List<Integer> rightBoundary = new LinkedList<>();
    List<Integer> leaves = new LinkedList<>();

    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        if (root == null) return result;
        if (root.left == null && root.right == null) return List.of(root.val);
        findLeftBoundary(root.left);
        findRightBoundary(root.right);
        findLeaves(root);
        result.add(root.val);
        result.addAll(leftBoundary);
        result.addAll(leaves);
        Collections.reverse(rightBoundary);
        result.addAll(rightBoundary);
        return result;
    }

    private void findLeftBoundary(TreeNode node) {
        if (node == null) return;
        if (node.left == null && node.right == null) return;
        leftBoundary.add(node.val);
        if (node.left!= null) {
            findLeftBoundary(node.left);
        } else {
            findLeftBoundary(node.right);
        }
    }

    private void findRightBoundary(TreeNode node) {
        if (node == null) return;
        if (node.left == null && node.right == null) return;
        rightBoundary.add(node.val);
        if (node.right!= null) {
            findRightBoundary(node.right);
        } else {
            findRightBoundary(node.left);
        }
    }

    private void findLeaves(TreeNode node) {
        if (node == null) return;
        if (node.left == null && node.right == null) {
            leaves.add(node.val);
            return;
        }
        findLeaves(node.left);
        findLeaves(node.right);
    }
}
