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
        

        ListNode temp = new ListNode(0);
        ListNode cur = temp;

        int carry = 0;

        while(l1 != null || l2 != null || carry != 0) {
            int val1 = 0, val2 = 0, sum = 0;

            if(l1 != null) {
                val1 = l1.val;
            }

            if(l2 != null) {
                val2 = l2.val;
            }

            sum = val1 + val2 + carry;

            carry = sum / 10;
            sum = sum % 10;

            cur.next = new ListNode(sum);


            cur = cur.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }


        if(carry != 0) {
            cur.next = new ListNode(carry);
        }

        return temp.next;
    }
}
