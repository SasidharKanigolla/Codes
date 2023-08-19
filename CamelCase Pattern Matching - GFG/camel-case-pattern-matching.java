//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String[] Dictionary=read.readLine().split(" ");
            String Pattern=read.readLine();
            Solution ob = new Solution();
            ArrayList <String> ans=ob.CamelCase(N,Dictionary,Pattern);
            for(String u:ans)
             System.out.print(u+" ");
            System.out.println(); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    ArrayList<String> CamelCase(int N,String[] Dictionary,String Pattern){
        //code here
        // ArrayList<String> str = new ArrayList<>();
        // int i=0,j=0,c=0,a=0;
        // for(i=0;i<dic.length;i++)
        // {
        //     a=0;
        //     c=0;
        //     for(j=0;j<dic[i].length();j++)
        //     {
        //         if(dic[i].charAt(j)==patt.charAt(a))
        //         {
        //             a++;
        //             c++;
        //         }
        //         if(c==patt.length())
        //         {
        //             str.add(dic[i]);
        //             break;
        //         }
        //     }
        // }
        // if(str.size()==0)
        // {
        //     str.add("-1");
        // }
        // return str;
        String ans = "";
        ArrayList<String> fans= new ArrayList<>();
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < Dictionary[i].length() ; j++){
                char charac = Dictionary[i].charAt(j);
                int ch = Dictionary[i].charAt(j);
                if(ch <= 90){
                    ans = ans + charac;
                }
                if(ans.equals(Pattern)){
                    fans.add(Dictionary[i]);
                    break;
                }
            }
            ans = "";
        }
        
        Collections.sort(fans);
        
        if(fans.size() == 0){
            fans.add("-1");
        }
        return fans;
        
    }
}