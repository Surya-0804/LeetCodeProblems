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
    public ListNode doubleIt(ListNode head) {
        ListNode current=reverse(head);
        int carry=0;
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        while(current!=null){
            int sum=carry+current.val*2;
            temp.next=new ListNode(sum%10);
            carry=sum/10;
            temp=temp.next;
            current=current.next;
        }
        if(carry>0){
            temp.next=new ListNode(carry);
        }
        return reverse(dummy.next);
    }
    private static ListNode reverse(ListNode head){
        ListNode current=head;
        ListNode prev=null;
        ListNode nextNode=null;
        while(current!=null){
            nextNode=current.next;
            current.next=prev;
            prev=current;
            current=nextNode;
        }
        return prev;
    }
}
