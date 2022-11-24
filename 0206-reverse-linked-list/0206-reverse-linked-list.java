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
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;

        while(current != null)
        {
            // storing the value of current.next
            ListNode nextOfCurrent = current.next;

            // making my current points to previous ie null
            current.next = previous;

            // now just shifting or moving forward my two pointers.
            previous = current;
            current = nextOfCurrent;
        }
        // here making my head as previous.
        head = previous;
        return head;
    }
}