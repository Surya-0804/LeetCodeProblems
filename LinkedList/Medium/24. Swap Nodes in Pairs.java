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
        ListNode newNode=new ListNode(0);
        newNode.next=head;
        ListNode prev=newNode;
        ListNode current=head;
        ListNode nextNode =current.next;
        while(current!=null && nextNode!=null){
            prev.next=nextNode;
            current.next=nextNode.next;
            nextNode.next=current;
            if(current.next==null){
                break;
            }
            prev=current;
            current=current.next;
            nextNode = current.next;
     
        }
        return newNode.next;
    }
}
