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

    public ListNode reverseList(ListNode head){
        ListNode previous = null;
        ListNode current = head;

        while(current != null)
        {
            ListNode nextOfCurr = current.next;

            current.next = previous;
            previous = current;
            current = nextOfCurr;
        }
        head = previous;
        return head;
    }

    public ListNode findMiddle(ListNode head){

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isPalindrome(ListNode head) {
        
        // find midd
        ListNode mid = findMiddle(head);

        //split it into two lists
        ListNode head2 = mid.next;
        mid.next = null;

        //reverse the second list.
        head2 = reverseList(head2);

        // check if both pointing value is equal or not
        ListNode p1 = head;
        ListNode p2 = head2;

        while(p1 != null && p2 != null)
        {
            if(p1.val != p2.val)
                return false;

                    p1 = p1.next;
                    p2 = p2.next;    
        }
        return true;
    }
}