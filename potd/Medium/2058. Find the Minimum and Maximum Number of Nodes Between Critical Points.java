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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev= head;
        ListNode current = head.next;
        int[] answer = {-1,-1};
        int prevPosition = -1;
        int currentPosition = -1;
        int firstPosition = -1;
        int position = 0;
        while(current.next != null){
            if((current.val < prev.val && current.val < current.next.val)||(current.val > prev.val && current.val > current.next.val)){
                prevPosition = currentPosition;
                currentPosition = position;
                if(firstPosition == -1){
                    firstPosition = position;
                }
                if(prevPosition != -1){
                    if(answer[0] == -1)
                        answer[0] = currentPosition - prevPosition;
                    else
                        answer[0] = Math.min(answer[0],currentPosition-prevPosition);
                    answer[1] = position - firstPosition;
                }
            }
            position++;
            prev = current;
            current = current.next;
        }
        return answer;
    }
}
