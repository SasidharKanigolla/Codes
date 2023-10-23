//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String S1 = read.readLine().trim(); 
            String S2 = read.readLine().trim(); 
            Solution obj = new Solution();
            if(obj.metaStrings(S1, S2))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    boolean metaStrings(String s1, String s2) 
    { 
        // code here
        if(s1.length()!=s2.length())
        return false;
        int c=0;
        ArrayList<Character> arr = new ArrayList<>(2);
        for(int i=0;i<s1.length();i++)
        {
            if(c==0&&s1.charAt(i)!=s2.charAt(i))
            {
                c++;
                arr.add(s2.charAt(i));
                arr.add(s1.charAt(i));
            }
            else if(c==1&&s1.charAt(i)!=s2.charAt(i))
            {
                c++;
                if(!arr.contains(s1.charAt(i))||!arr.contains(s2.charAt(i)))
                {
                    return false;
                }
            }
            else if(s1.charAt(i)!=s2.charAt(i))
            {
                c++;
                break;
            }
        }
        if(c==2) return true;
        return false;
    }
} 


