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
    public ListNode oddEvenList(ListNode head) {
        if(head==null)
            return head;
        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenhead=head.next;
        while(even!=null && even.next!=null){
            odd.next=odd.next.next;
            even.next=even.next.next;
            even=even.next;
            odd=odd.next;
        }
        odd.next=evenhead;
        return head;
    }
}
