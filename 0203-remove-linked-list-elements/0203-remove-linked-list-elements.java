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
    public ListNode removeElements(ListNode head, int data) {
       ListNode dummy = new ListNode (-1);
       ListNode previous = dummy;
       dummy.next = head;
       ListNode current = head;

        while(current!= null)
        {
            if(current.val == data)
            {
                previous.next = current.next;
            }
            else
            {
                previous = previous.next;
            }
            current = current.next;
        }

        return dummy.next;
    }
}