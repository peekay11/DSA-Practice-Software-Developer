package medium.ex04_binary_tree_level_order;

import testrunner.TestRunner;
import medium.ex04_binary_tree_level_order.BinaryTreeLevelOrder.TreeNode;
import java.util.List;

public class BinaryTreeLevelOrderTest {
    public void testTreeTraversal() {
        TreeNode root = new TreeNode(3,
            new TreeNode(9),
            new TreeNode(20, new TreeNode(15), new TreeNode(7))
        );
        List<List<Integer>> res = BinaryTreeLevelOrder.levelOrder(root);
        TestRunner.assertEquals(3, res.size());
        TestRunner.assertEquals(1, res.get(0).size());
        TestRunner.assertEquals(3, (int) res.get(0).get(0));
        TestRunner.assertEquals(2, res.get(1).size());
        TestRunner.assertEquals(9, (int) res.get(1).get(0));
        TestRunner.assertEquals(20, (int) res.get(1).get(1));
    }

    public void testEmptyTree() {
        List<List<Integer>> res = BinaryTreeLevelOrder.levelOrder(null);
        TestRunner.assertEquals(0, res.size());
    }
}
