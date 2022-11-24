/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    public int getLenght(ListNode head){

        if(head == null)
        {
            return 0;
        }

        int len = 0;
        ListNode current = head;

        while(current != null)
        {
            len++;
            current = current.next;
        }
        return len;
    }


    

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode firstList = headA;
        ListNode secondList = headB;


        // first find the size.

        int size1 = getLenght(headA);
        int size2 = getLenght(headB);



        // move the bigger size list with their diff steps.
        
        if(size1 > size2)
        {
            int diff = size1 - size2;
            while(diff > 0)
            {
                firstList = firstList.next;
                diff--;
            }
        }

        else if(size2 > size1)
        {
            int diff = size2 - size1;
            while(diff > 0)
            {
                secondList = secondList.next;
                diff--;
            }
        }

        // move both list at same pase and we will get our meeting point.

        while(firstList != null && secondList != null)
        {
            if(firstList == secondList)
            {
                return firstList;
            }

            firstList = firstList.next;
            secondList = secondList.next;
        }
        return firstList;
    }
}