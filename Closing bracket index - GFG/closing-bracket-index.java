//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next();
            int pos = sc.nextInt();
    		System.out.println (new Sol().closing (s, pos));
        }
        
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int closing (String s, int pos)
    {
        // your code here       
        Stack<Integer> st = new Stack<>();
        int c=0;
        for(int i=pos;i<s.length();i++)
        {
            if(s.charAt(i)=='[')
            {
                c++;
                st.push(c);
            }
            else if(s.charAt(i)==']')
            {
                st.pop();
                if(st.isEmpty())
                {
                    return i;
                }
            }
        }
        return -1;
    }
}