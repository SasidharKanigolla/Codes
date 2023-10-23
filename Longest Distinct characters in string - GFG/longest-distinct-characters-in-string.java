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
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubstrDistinctChars(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int longestSubstrDistinctChars(String s){
        // code here
        HashMap<Character,Integer> map = new HashMap<>();
        int c=0,max=1,j=0;
        String temp="";
        for(int i=0;i<s.length();i++)
        {
            char a =s.charAt(i);
            if(map.containsKey(a)==true)
            {
               while(j<i&&map.containsKey(a)) 
               {
                   map.remove(s.charAt(j));
                   j++;
               }
            }
            
                map.put(a,0);
                // c++;
            
            max=Math.max(i-j+1,max);
        }
        return max;
    }
}