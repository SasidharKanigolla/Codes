//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String N = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.findMax(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static String findMax(String n) {
        // HashMap<Integer,Integer> map = new HashMap<>(9);
        int[] arr = new int[10];
        for(int i=0;i<n.length();i++)
        {
            arr[(n.charAt(i)-'0')]++;
        }
        String ans="";
        for(int i=9;i>=0;i--)
        {
            while(arr[i]!=0)
            {
                ans+=String.valueOf(i);
                arr[i]--;
            }
        }
        return ans;  
    }
};