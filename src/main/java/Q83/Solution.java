package Q83;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        List<Integer> result = new ArrayList<Integer>();
        ListNode p1 = head;
        ListNode p2;
        while(p1 != null && p1.next!= null) {
            result.add(p1.val);
            p2 = p1.next;
            while(p2!=null && result.contains(p2.val) ){
                if (p2.next != null) {
                    p2 = p2.next;
                } else {
                    p2 = null;
                }
            }
            p1.next = p2;
            p1 = p2;
        }
        return head;
    }

    public ListNode deleteDuplicatesBetterSolution(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}