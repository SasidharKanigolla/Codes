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
        if(list1==null)
        {
            return list2;
        }
        if(list2==null)
        {
            return list1;
        }
        ListNode dummy = new ListNode(-101);
        ListNode first=list1,second=first.next,temp=dummy;
        ListNode third=list2,fourth=third.next;
        while(first!=null&&third!=null)
        {
            if(first.val<=third.val)
            {
                temp.next=first;
                first.next=null;
                temp=first;
                first=second;
                if(second!=null)
                second=second.next;
            }
            else
            {
                temp.next=third;
                third.next=null;
                temp=third;
                third=fourth;
                if(fourth!=null)
                fourth=fourth.next;
            }
        }
        if(first!=null)
        {
            temp.next=first;
        }
        if(third!=null)
        {
            temp.next=third;
        }
        return dummy.next;
    }
}