//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isFactorial(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int isFactorial(int N) {
        int pro=1,i=1;
        while(true)
        {
            pro*=i;
            if(pro==N)
            {
                return 1;
            }
            if(pro>N)
            {
                break;
            }
            i++;
        }
        return 0;
    }
}