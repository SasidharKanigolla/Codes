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
    public ListNode partition(ListNode head, int k) {
        if(head==null||head.next==null) return head;
        ListNode dummy =new ListNode(-201);
        dummy.next=head;
        ListNode first=dummy,sec=null,thi=null,fou=head,temp=null;
        while(fou!=null)
        {

            if(fou.val>=k)
            {
                if(sec==null)
                sec=fou;
                while(fou!=null&&fou.val>=k)
                {
                    thi=fou;
                    fou=fou.next;
                }
                if(fou==null)
                {
                    break;
                }
                first.next=fou;
                thi.next=fou.next;
                fou.next=sec;
                first=first.next;
                fou=thi;
            }
            else
            {
                if(first==dummy||first.next.val<k)
                {
                    first=first.next;
                }
                fou=fou.next;
            }
        }
        // first.next=fou;
        // // thi.next=fou.next;
        //         fou.next=sec;
        return dummy.next;
    }
}