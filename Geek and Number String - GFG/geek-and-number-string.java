//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t > 0){
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            Solution ob = new Solution();
            System.out.println(ob.minLength(s, n));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution { 
    public int minLength(String s, int n) { 
    	// code here 
    	Stack<Integer> st = new Stack<>();
    	int arr[] ={9,2,1,4,3,6,5,8,7,0};
    	for(char c:s.toCharArray())
    	{
    	    int x = c-'0';
    	    if(!st.isEmpty()&&arr[st.peek()]==x)
    	    {
    	        st.pop();
    	    }
    	    else
    	    {
    	        st.push(x);
    	    }
    	    
    	}
    	return st.size();
    }
}