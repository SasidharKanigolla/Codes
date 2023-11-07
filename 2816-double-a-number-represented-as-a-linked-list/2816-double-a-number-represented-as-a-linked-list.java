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
    ListNode reverse(ListNode head)
    {
        ListNode curr=head,prev=null,temp=null;
        while(curr!=null)
        {
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public ListNode doubleIt(ListNode head) {
        head=reverse(head);
        ListNode curr=head;
        int sum=0,carry=0;
        while(curr!=null)
        {
            sum=curr.val*2;
            curr.val=(sum+carry)%10;
            carry=(sum+carry)/10;
            if(curr.next==null&&carry!=0) 
            {
            curr.next=new ListNode(1);
            curr=curr.next;
            }
            curr=curr.next;
        }
        return reverse(head);
    }
}