//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class GFG{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            Solution g = new Solution();
            head = g.deleteMid(head);
            printList(head); 
            t--;
        }
    } 
} 
   

// } Driver Code Ends


/*
class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        if(head==null||head.next==null)
        {
            return null;
        }
        int c=0;
        Node temp=head;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        int k;
        if(c%2==0)
        {
        k=c/2;
        c=0;
        Node curr=head,prev=null;
        while(curr!=null)
        {
            if(k==c)
            {
                prev.next=curr.next;
                break;
            }
            prev=curr;
            curr=curr.next;
            c++;
        }
        }
        else
        {
        k=c/2;
        c=0;
        Node curr=head,prev=null;
        while(curr!=null)
        {
            if(k==c)
            {
                prev.next=curr.next;
                break;
            }
            prev=curr;
            curr=curr.next;
            c++;
        }
        }
        
        return head;
    }
}