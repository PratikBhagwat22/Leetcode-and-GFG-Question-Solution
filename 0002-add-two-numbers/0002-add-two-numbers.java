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
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {

        // make a dummy node
            ListNode dummy = new ListNode(-1);
            ListNode current = dummy;

        
            ListNode p1 = list1;
            ListNode p2 = list2;
            int carry = 0;
            while(p1 != null || p2 != null || carry == 1)
            {
                int add = 0;

                if(p1 != null)
                {
                    add += p1.val;
                    p1 = p1.next;
                }
                if(p2 != null)
                {
                    add += p2.val;
                    p2 = p2.next;
                }
                
                add += carry;
                carry = add / 10;

                ListNode nn = new ListNode(add % 10);
            
                current.next = nn;
                current = current.next;
            }
            ListNode head = dummy.next;
            return head;
    }
}