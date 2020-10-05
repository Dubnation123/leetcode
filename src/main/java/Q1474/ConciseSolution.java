package Q1474;

public class ConciseSolution {
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode prev = null; // pointer to previous node
        ListNode cur = head; // pointer to current node
        while (cur != null) {
            // skip up to m nodes
            for (int i = 0; i < m && cur != null; ++i) {
                prev = cur;
                cur = cur.next;
            }
            // remove up to n nodes
            for (int i = 0; i < n && cur != null; ++i) {
                cur = cur.next;
            }
            prev.next = cur;
        }
        return head;
    }
}
