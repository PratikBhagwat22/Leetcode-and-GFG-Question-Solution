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

    public ListNode addFirst(ListNode head){
        if(head==null || head.next == null)
        {
            return head;
        }
        ListNode curr = head;
        ListNode prevOfCurr = null;

        while(curr.next!= null)
        {
            prevOfCurr = curr;
            curr = curr.next;
        }
        curr.next = head;
        prevOfCurr.next = null;
        head = curr;
        return curr;
    }

    public int getLength(ListNode head){
        int len = 0;
        ListNode curr = head;

        while(curr!=null)
        {
            len++;
            curr = curr.next;
        }
        return len;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next== null)
        {
            return head;
        }

        /*
        we can find the length of a list like this also...
        int i;
            for (i=0;fast.next!=null;i++)//Get the total length 
                fast=fast.next;

        */        

        int size = getLength(head);

        for(int i=1; i<= k % size; i++)
        {
            head = addFirst(head);
        }
        return head;
    }
}