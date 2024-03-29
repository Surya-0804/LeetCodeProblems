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
        if (head == null || k == 0)
            return head;

        ListNode tail = head;
        int len = 1; 
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }

        k = k % len;
        if (k == 0)
            return head; 

        tail.next = head;

        ListNode prev = head;
        for (int i = 0; i < len - k - 1; i++) {
            prev = prev.next;
        }

        head = prev.next;

        prev.next = null;

        return head; 
    }
}
