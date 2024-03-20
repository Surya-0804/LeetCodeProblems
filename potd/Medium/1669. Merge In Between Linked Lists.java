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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode prev=list1;
        ListNode nextNode=list1;
        while(a!=1){
            prev=prev.next;
            a--;
        }
        while(b--!=0){
            nextNode=nextNode.next;
        }
        prev.next=list2;
        ListNode current=list2;
        while(current.next!=null){
            current=current.next;
        }
        current.next=nextNode.next;
        return list1;
    }
}
