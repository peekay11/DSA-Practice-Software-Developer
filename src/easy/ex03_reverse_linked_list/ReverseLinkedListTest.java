package easy.ex03_reverse_linked_list;

import org.junit.jupiter.api.Test;

import testrunner.TestRunner;
import easy.ex03_reverse_linked_list.ReverseLinkedList.ListNode;

public class ReverseLinkedListTest {
    @Test
    public void testMultipleNodes() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));
        ListNode rev = ReverseLinkedList.reverseList(head);
        TestRunner.assertEquals(4, rev.val);
        TestRunner.assertEquals(3, rev.next.val);
        TestRunner.assertEquals(2, rev.next.next.val);
        TestRunner.assertEquals(1, rev.next.next.next.val);
        TestRunner.assertNull(rev.next.next.next.next);
    }

    @Test
    public void testSingleAndNull() {
        TestRunner.assertNull(ReverseLinkedList.reverseList(null));
        ListNode single = new ListNode(42);
        ListNode rev = ReverseLinkedList.reverseList(single);
        TestRunner.assertEquals(42, rev.val);
        TestRunner.assertNull(rev.next);
    }
}
