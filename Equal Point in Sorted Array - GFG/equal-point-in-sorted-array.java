//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine()); 
        while(t-->0)
        {
            int n = Integer.parseInt(read.readLine()); 
            int a[] = new int[n];
            
            String line = read.readLine(); // to read multiple integers line
            String[] strs = line.trim().split("\\s+");
            
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(strs[i]);
            }
            
            Compute obj = new Compute();
            System.out.println( obj.findEqualPoint(a, n) );
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Compute 
{
    static int findEqualPoint(int arr[], int n) 
	{
	    int c=0;
	    for(int i=0;i<n;i++)
	    {
	        if(i==0)c++;
	        else if(arr[i-1]!=arr[i])
	        c++;
	    }
	    if(c%2==0)return -1;
	    int a=c;
	    for(int i=0;i<n;i++)
	    {
	        if(i==0)c--;
	        else if(arr[i-1]!=arr[i])
	        c--;
	        if(c==a/2)
	        {
	            return i;
	        }
	        
	    }
	    return -1;
	}
} 
