//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            long ans = new Solution().distance(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    long distance(int[] arr, int n) {
        if(n==1)
        return 0;
        if(n==2)
        return 1;
        long ar[] = new long[n];
        long sum=0;
        for(int i=0;i<n;i++)
        {
            ar[arr[i]-1]=i;
        }
        for(int i=1;i<n;i++)
        {
            sum+=Math.abs(ar[i]-ar[i-1]);
        }
        return sum;
    }
}
