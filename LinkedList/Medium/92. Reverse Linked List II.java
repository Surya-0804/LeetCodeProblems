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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head==null || left==right)
            return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }
        if(prev==null)
            return head;
        ListNode current = prev.next;
        ListNode nextNode;
        for (int i = left; i < right; i++) {
            nextNode = current.next;
            current.next = nextNode.next;
            nextNode.next = prev.next;
            prev.next = nextNode;
        }

        
        return dummy.next;

    }
}
