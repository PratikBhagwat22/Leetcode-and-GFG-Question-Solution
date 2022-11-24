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
    public int getDecimalValue(ListNode head) {
        String binary = "";

        if(head==null)
        {
            return 0;
        }

        ListNode current = head;
        while(current != null)
        {
            binary = binary + current.val;
            current = current.next;
        }
        // converting String to the base 2(binary)
        return Integer.parseInt(binary,2);
    }
}