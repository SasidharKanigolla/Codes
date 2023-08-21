//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		String s12 = sc.nextLine();
		for(int i=0; i<t; i++){
		    String s1 = sc.nextLine();
		    String s2 = sc.nextLine();
		    
		    Solution obj = new Solution();
		    
		    boolean flag = obj.isRotated(s1, s2);
		    
		    if(flag == true) System.out.println("1");
		    else System.out.println("0");
		    
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
        if(str1.length()!=str2.length())
        {
            return false;
        }
        if(str1.length()==1)
        {
            if(str1.charAt(0)!=str2.charAt(0))
            {
                return false;
            }
            return true;
        }
        StringBuilder str = new StringBuilder();
        str.append(str1.substring(2,str1.length()));
        str.append(str1.substring(0,2));
        if(str.toString().equals(str2))
        {
            return true;
        }
        StringBuilder st = new StringBuilder();
        st.append(str1.substring(str.length()-2,str1.length()));
        st.append(str1.substring(0,str1.length()-2));
        if(st.toString().equals(str2))
        {
            return true;
        }
        return false;
    }
    
}