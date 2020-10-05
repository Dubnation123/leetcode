package Q1474;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class Solution {
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode start = head;
        ListNode next = head;
        int count = 0;
        boolean keep = true;
        while (start != null && next.next != null) {
            count++;
            if (keep && count == m) {
                keep = false;
                count = 0;
                start = next;
            } else if (!keep && count == n) {
                keep = true;
                count = 0;
                start.next = next.next;
                start = next.next;
            }
            next = next.next;
        }
        if (!keep) {
            start.next = null;
        }
        return head;
    }
}