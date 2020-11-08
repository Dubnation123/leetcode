package Q141;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean hasCycle(ListNode head) {
        Set<ListNode> uniqueNodes = new HashSet<>();
        while(head != null && head.next != null) {
            if (uniqueNodes.contains(head)) {
                return true;
            } else {
                uniqueNodes.add(head);
            }
            head = head.next;
        }
        return false;
    }
}
