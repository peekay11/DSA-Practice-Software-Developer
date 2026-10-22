package medium.ex04_binary_tree_level_order;

import java.util.List;

public class BinaryTreeLevelOrder {
    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int val) { this.val = val; }
        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        // TODO: Queue-based BFS
        throw new UnsupportedOperationException("Not implemented");
    }
}
