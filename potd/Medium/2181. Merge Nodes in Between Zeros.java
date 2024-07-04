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
    public ListNode mergeNodes(ListNode head) {
        ListNode current=head.next;
        ListNode nextNode= head.next;

        while(nextNode != null){
            int sum = 0;
            while(nextNode.val != 0){
                sum+=nextNode.val;
                nextNode=nextNode.next;
            }
            current.val = sum;
            nextNode=nextNode.next;
            current.next=nextNode;
            current=current.next;
        }
        return head.next; 
    }
}
