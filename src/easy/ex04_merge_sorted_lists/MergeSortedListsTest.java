package easy.ex04_merge_sorted_lists;

import org.junit.jupiter.api.Test;

import testrunner.TestRunner;
import easy.ex04_merge_sorted_lists.MergeSortedLists.ListNode;

public class MergeSortedListsTest {
    @Test
    public void testMergeBothPresent() {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode res = MergeSortedLists.mergeTwoLists(l1, l2);
        
        int[] expected = {1, 1, 2, 3, 4, 4};
        ListNode cur = res;
        for (int exp : expected) {
            TestRunner.assertNotNull(cur, "Node must not be null");
            TestRunner.assertEquals(exp, cur.val);
            cur = cur.next;
        }
        TestRunner.assertNull(cur);
    }

    @Test
    public void testOneNull() {
        ListNode l1 = new ListNode(10);
        TestRunner.assertEquals(10, MergeSortedLists.mergeTwoLists(l1, null).val);
        TestRunner.assertEquals(20, MergeSortedLists.mergeTwoLists(null, new ListNode(20)).val);
        TestRunner.assertNull(MergeSortedLists.mergeTwoLists(null, null));
    }
}
