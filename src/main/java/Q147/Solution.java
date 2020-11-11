package Q147;

// 我喜欢这样的我自己
public class Solution {

  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode insertionSortList(ListNode head) {
          ListNode newHead = head;
          ListNode newEnd = head;
          while (newHead != null && newEnd.next != null) {
              ListNode target = newEnd.next;
              ListNode compare = newHead;
              while(compare.next!=null && compare!=target) {
                  if (target.val < newHead.val) {
                      newEnd.next = target.next;
                      target.next = newHead;
                      newHead = target;
                      break;
                  } else if (target.val < compare.next.val) {
                      newEnd.next = target.next;
                      target.next = compare.next;
                      compare.next = target;
                      break;
                  } else {
                      compare = compare.next;
                  }
              }
              if (compare == target) {
                  newEnd = target;
              }
        }
          return newHead;
    }
}
