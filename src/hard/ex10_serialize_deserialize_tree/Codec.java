package hard.ex10_serialize_deserialize_tree;

public class Codec {
    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int x) { val = x; }
        public TreeNode(int x, TreeNode left, TreeNode right) {
            this.val = x;
            this.left = left;
            this.right = right;
        }
    }

    public String serialize(TreeNode root) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public TreeNode deserialize(String data) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
