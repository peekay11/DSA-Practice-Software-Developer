package hard.ex10_serialize_deserialize_tree;

import org.junit.jupiter.api.Test;

import testrunner.TestRunner;
import hard.ex10_serialize_deserialize_tree.Codec.TreeNode;

public class CodecTest {
    @Test
    public void testRoundtrip() {
        Codec codec = new Codec();
        TreeNode root = new TreeNode(1,
            new TreeNode(2),
            new TreeNode(3, new TreeNode(4), new TreeNode(5))
        );
        String serialized = codec.serialize(root);
        TreeNode recovered = codec.deserialize(serialized);

        TestRunner.assertEquals(1, recovered.val);
        TestRunner.assertEquals(2, recovered.left.val);
        TestRunner.assertEquals(3, recovered.right.val);
        TestRunner.assertEquals(4, recovered.right.left.val);
        TestRunner.assertEquals(5, recovered.right.right.val);
    }

    @Test
    public void testNullTree() {
        Codec codec = new Codec();
        TestRunner.assertNull(codec.deserialize(codec.serialize(null)));
    }
}
