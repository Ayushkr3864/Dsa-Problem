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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int length = 1;
        while(curr.next!=null){
            curr = curr.next;
            length++;
        }
       if(n==length){
        return head.next;
       }
        
        ListNode currNode = head;
        for(int i=1;i<length-n;i++){
            currNode = currNode.next;
        }
        currNode.next = currNode.next.next;
        return head;
    }
}