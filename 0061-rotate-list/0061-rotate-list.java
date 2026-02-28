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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode curr = head;
        int length = 1;
        if(head==null){
            return head;
        }
        while(curr.next!=null){
            curr = curr.next;
            length++;
        }
        k = k%length;
        if(k == 0){
            return head;
        }

    ListNode fast = head;
    for(int i=0;i<k;i++){
        fast = fast.next;
    }
    ListNode slow = head;
    while(fast.next!=null){
        slow = slow.next;
        fast = fast.next;
    }

    ListNode newHead = slow.next;
    slow.next = null;
    fast.next = head;
    return newHead;
    }
}