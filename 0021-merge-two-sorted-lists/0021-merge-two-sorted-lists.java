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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // here iam creating a new node with -1 value.
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // here iam assigning point1 and point2 for both list
        ListNode point1List = list1;
        ListNode point2List = list2;

        while(point1List != null && point2List != null)
        {
            // here iam saving point1 & point2 next values in new point for saftey.
            ListNode newPoint1 = point1List.next;
            ListNode newPoint2 = point2List.next;

            // here iam checking if my p1 is smaller than p2 then make that smaller value as current.next.
            if(point1List.val < point2List.val)
            {
                current.next = point1List;
                point1List = newPoint1;
            }
            else
            {
                current.next = point2List;
                point2List = newPoint2;
            }
            // and after every pointing iam moving my current to nextPoint.
            current = current.next;
        }

        if(point1List == null)
        {
            current.next = point2List;
        }
        else if(point2List == null)
        {
            current.next = point1List;
        }
            // here iam making my dummy was -1 so dummy.next will be my head.
        ListNode headAns = dummy.next;
        return headAns;
    }
}