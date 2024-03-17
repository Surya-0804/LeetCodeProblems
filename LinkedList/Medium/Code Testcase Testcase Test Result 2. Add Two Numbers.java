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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newList=new ListNode(0);
        int carry=0;
        ListNode current=newList;
        while(l1!=null || l2!=null || carry!=0){
            int a=(l1!=null)? l1.val:0;
            int b=(l2!=null)?l2.val:0;
            int sum=a+b+carry;
            carry=sum/10;
            sum%=10;
            current.next=new ListNode(sum);
            current=current.next;
            l1=(l1!=null)?l1.next:null;
            l2=(l2!=null)?l2.next:null;
        }
        return newList.next;
    }
}
