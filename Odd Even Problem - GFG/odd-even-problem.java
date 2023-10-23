//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.oddEven(S));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution{
    static String oddEven(String s) {
        // code here
        HashMap<Character,Integer> map = new HashMap<>();
        int a=0,b=0;
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(char c:map.keySet())
        {
            if(((c-'a')+1)%2==0&&map.get(c)%2==0)
            {
                a++;
            }
            else if(((c-'a')+1)%2!=0&&map.get(c)%2!=0)
            {
                b++;
            }
        }
        if((a+b)%2==0) return "EVEN";
        return "ODD";
    }
}