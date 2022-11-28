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
    ListNode originalHead;
    ListNode originalTail;
    ListNode tempHead;
    ListNode tempTail;

    public void addFirst(ListNode head){
        ListNode curr = head;
        if(tempHead == null)
        {
            tempHead = curr;
            tempTail = curr;
        }
        else{
            curr.next = tempHead;
            tempHead = curr;
        }
    }

    public int getLength(ListNode head){
        ListNode curr = head;
        int len = 0;

        while(curr!= null)
        {
            len++;
            curr = curr.next;
        }
        return len;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        originalHead = null;
        originalTail = null;
        tempHead = null;
        tempTail = null;

    int size = getLength(head);

    ListNode curr = head;
    while(size >= k)
    {
        int K = k;
        while(K-- > 0)
        {
            ListNode nextOfCurr = curr.next;
            addFirst(curr);
            curr = nextOfCurr;
            size--;
        }
        // if y OH is null then only point OH to TH.
        if(originalHead == null)
        {
             originalHead = tempHead;
             originalTail = tempTail;
        }
        else
        {
            originalTail.next = tempHead;
            originalTail = tempTail;
        }

        tempHead = null;
        tempTail = null;   
    }
    // at last if any node is left then just point Originaltail.next to our current.
        originalTail.next = curr;
        return originalHead;
    }
}