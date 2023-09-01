//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    static void perm(ArrayList<String> ans,String str,int[] arr,String s)
    {
        if(str.length()==s.length())
        {
            ans.add(str);
            // str="";
            return ;
        }
        for(int i=0;i<s.length();i++)
        {
            if(arr[i]==0)
            {
                str+=s.charAt(i);
                arr[i]=1;
                perm(ans,str,arr,s);
                str=str.substring(0,str.length()-1);
                arr[i]=0;
            }
        }
    }
    public ArrayList<String> permutation(String s)
    {
        ArrayList<String> ans = new ArrayList<>();
        // String str="";
        int[] arr = new int[s.length()];
        perm(ans,"",arr,s);
        Collections.sort(ans);
        return ans;
    }
	   
}
