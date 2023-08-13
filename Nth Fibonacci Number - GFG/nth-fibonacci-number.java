//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}
// } Driver Code Ends




//User function Template for Java

//User function Template for Java
class Solution {
    static long nthFibonacci(long n){
        int N =(int)n;
        long[] a = new long[N+1];
        int i;
        a[0]=0;
        a[1]=1;
        for(i=2;i<=N;i++)
        {
            a[i]=(a[i-1]+a[i-2])%1000000007;
            
        }
        return a[N];
    }
}