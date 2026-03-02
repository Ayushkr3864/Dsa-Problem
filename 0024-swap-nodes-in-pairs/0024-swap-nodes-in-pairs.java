/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        ListNode prev = null;
            head = fast;
      while (slow != null && slow.next != null){
         ListNode nextPair = fast.next;

              fast.next = slow;
            slow.next = (nextPair != null && nextPair.next != null) ? nextPair.next : nextPair;
             if (prev != null) {
                prev.next = fast;
            } 
               prev = slow;

                  slow = nextPair;
            fast = (slow != null) ? slow.next : null;
         
        }
         return head;
    }
}