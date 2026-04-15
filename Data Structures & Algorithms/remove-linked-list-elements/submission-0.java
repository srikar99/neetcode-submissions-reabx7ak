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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0, head);
        ListNode curr = head, prev = dummy;

        while(curr != null) {
            ListNode next = curr.next;
            if(curr.val != val) {
                prev = curr;
            } else {
                prev.next = next;
            }
            curr = curr.next;
        }

        return dummy.next;
    }
}