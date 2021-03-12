package Q987;

public class Solution {

    private class HelperNode {
        int column;
        int row;
        int val;

        public HelperNode(int column, int row, int val) {
            this.column = column;
            this.row = row;
            this.val = val;
        }
    }

//    List<HelperNode> result = new ArrayList<>();
//    public List<List<Integer>> verticalTraversal(TreeNode root) {
//        helper(root, 0,0);
//        Map<Integer, List<Integer>> temp = result.stream().sorted((a,b) -> {
//            if (a.column != b.column) return a.column - b.column;
//            if (a.row != b.row) return a.row - b.row;
//            return a.val - b.val;
//        }).collect(groupingBy(a -> a));
//
//    }

//    private void helper(TreeNode root, int column, int row) {
//        if (root == null) return;
//        if (root.left == null && root.right == null) {
//            result.add(new HelperNode(column, row, root.val));
//        }
//        helper(root.left, column -1, row +1);
//        helper(root.right, column +1 , row+ 1);
//    }
}
