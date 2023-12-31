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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode sum_ = new ListNode(-1);
       ListNode curr=sum_;
    //    curr=sum_.next;
    //    curr.next=null;
       int carry=0,sum=0;
       while(l1!=null&&l2!=null)
       {
           sum=l1.val+l2.val+carry;
           if(sum>9)
           {
               carry=1;
           }
           else carry=0;
       l1=l1.next;
       l2=l2.next;
        ListNode temp=new ListNode(sum%10);
        curr.next=temp;
        curr=curr.next;
    //    temp=temp.next;
       }
       while(l1!=null)
       {
           sum=l1.val+carry;
           if(sum>9)
           {
               carry=1;
           }
           else carry=0;
        l1=l1.next;
        ListNode temp=new ListNode(sum%10);
        curr.next=temp;
        curr=curr.next;
       }
       while(l2!=null)
       {
           sum=l2.val+carry;
           if(sum>9)
           {
               carry=1;
           }
           else carry=0;
        l2=l2.next;
        ListNode temp=new ListNode(sum%10);
        curr.next=temp;
        curr=curr.next;
       }
       if(carry!=0)
       {
        ListNode temp=new ListNode(1);
        curr.next=temp;
        curr=curr.next;
       }
    return sum_.next;
    }
}