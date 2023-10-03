//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
     Node addTwoLists(Node l1, Node l2){
        Node curr=l1,prev=null,temp_;
        while(curr!=null)
        {
            temp_=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp_;
        }
        l1=prev;
        curr=l2;prev=null;
        while(curr!=null)
        {
            temp_=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp_;
        }
        l2=prev;
        
        Node sum_ = new Node(-1);
        curr=sum_;
        int carry=0,sum=0;
       while(l1!=null&&l2!=null)
       {
           sum=l1.data+l2.data+carry;
           if(sum>9)
           {
               carry=1;
           }
           else carry=0;
       l1=l1.next;
       l2=l2.next;
        Node temp=new Node(sum%10);
        curr.next=temp;
        curr=curr.next;
    //    temp=temp.next;
       }
       while(l1!=null)
       {
           sum=l1.data+carry;
           if(sum>9)
           {
               carry=1;
           }
           else carry=0;
        l1=l1.next;
        Node temp=new Node(sum%10);
        curr.next=temp;
        curr=curr.next;
       }
       while(l2!=null)
       {
           sum=l2.data+carry;
           if(sum>9)
           {
               carry=1;
           }
           else carry=0;
        l2=l2.next;
        Node temp=new Node(sum%10);
        curr.next=temp;
        curr=curr.next;
       }
       if(carry!=0)
       {
        Node temp=new Node(1);
        curr.next=temp;
        curr=curr.next;
       }
       curr=sum_.next;prev=null;
        while(curr!=null)
        {
            temp_=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp_;
        }
       return prev;
    }
    // Node reverse(Node head)
    // {
    //     Node curr=head,prev=null,temp;
    //     while(curr!=null)
    //     {
    //         temp=curr.next;
    //         curr.next=prev;
    //         prev=curr;
    //         curr=temp;
    //         // if(temp!=null)
    //         // temp=temp.next;
    //     }
    //     // curr.next=prev;
    //     // prev = curr;
    //     return prev;
    // }
}