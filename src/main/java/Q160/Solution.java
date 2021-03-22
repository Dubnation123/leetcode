package Q160;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = nodeLength(headA);
        int lengthB = nodeLength(headB);
        if (lengthA > lengthB) {
            for (int i = 0; i < lengthA - lengthB; i++) {
                headA = headA.next;
            }
        } else {
            for (int i = 0; i < lengthB - lengthA; i++) {
                headB = headB.next;
            }
        }
       while (headA != null && headB != null) {
           if (headA != headB) {
               headA = headA.next;
               headB = headB.next;
           } else {
               return headA;
           }
       }
       return null;
    }

    private int nodeLength(ListNode node) {
        int result = 0;
        while (node != null) {
            result += 1;
            node = node.next;
        }
        return result;
    }
}
