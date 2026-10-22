package hard.ex01_merge_k_sorted_lists;

import org.junit.jupiter.api.Test;

import testrunner.TestRunner;
import hard.ex01_merge_k_sorted_lists.MergeKSortedLists.ListNode;

public class MergeKSortedListsTest {
    @Test
    public void testMergeThreeLists() {
        ListNode l1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode l3 = new ListNode(2, new ListNode(6));

        ListNode res = MergeKSortedLists.mergeKLists(new ListNode[]{l1, l2, l3});
        int[] exp = {1, 1, 2, 3, 4, 4, 5, 6};
        ListNode cur = res;
        for (int v : exp) {
            TestRunner.assertNotNull(cur, "Node should not be null");
            TestRunner.assertEquals(v, cur.val);
            cur = cur.next;
        }
        TestRunner.assertNull(cur);
    }

    @Test
    public void testEmptyOrNull() {
        TestRunner.assertNull(MergeKSortedLists.mergeKLists(new ListNode[]{}));
        TestRunner.assertNull(MergeKSortedLists.mergeKLists(null));
    }
}
