//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());//testcases
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(reader.readLine());//input n
            //printing "1" if isLucky() returns true else "0"
            Solution s = new Solution();
            System.out.println(s.isLucky(n)? "1" : "0");
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution
{
    // Complete the function
    // n: Input n
    // Return True if the given number is a lucky number else return False
    static boolean lucky(int n,int i)
    {
        if(n%i==0)
        {
            return false;
        }
        if(n<i)
        {
            return true;
        }
        return lucky(n-n/i,i+1);
    }
    public static boolean isLucky(int n)
    {
        // Your code here
        return lucky(n,2);
    }
}