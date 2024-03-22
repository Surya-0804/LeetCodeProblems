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
    public boolean isPalindrome(ListNode head) {
        int len=0;
        ListNode tail=head;
        while(tail.next!=null){
            len++;
            tail=tail.next;
        }
        tail=head;
        for(int i=0;i<(int)len/2;i++){
            tail=tail.next;
        }
        ListNode prev=null;
        ListNode nextNode=null;
        ListNode current=tail;
        while(current!=null){
            nextNode=current.next;
            current.next=prev;
            prev=current;
            current=nextNode;
        }
        tail=prev;
        current=head;
        while(current!=null&&tail!=null){
            if(current.val!=tail.val){
                return false;
            }
            current=current.next;
            tail=tail.next;
        }
        return true;
    }
}
