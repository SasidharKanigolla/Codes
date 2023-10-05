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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode,Integer> map = new HashMap<>();
        ListNode temp1=headA,temp2=headB;
        while(temp1!=null)
        {
            map.put(temp1,map.getOrDefault(temp1,0)+1);
            temp1=temp1.next;
        }
        int inter = 0;
        while(temp2!=null)
        {
            if(map.get(temp2)!=null)
            {
                 return temp2; 
            }
            temp2=temp2.next;
        }
        // temp2=headB;
        // if(inter==0) return null;
        // while(temp2!=null)
        // {
        //     if(temp2.val==inter)
        //     return temp2;
        //     temp2=temp2.next;
        // }
        return null;
    }
}