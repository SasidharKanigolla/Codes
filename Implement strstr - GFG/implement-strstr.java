//{ Driver Code Starts
import java.util.*;


class Implement_strstr
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String line = sc.nextLine();
			String a = line.split(" ")[0];
			String b = line.split(" ")[1];
			
			GfG g = new GfG();
			System.out.println(g.strstr(a,b));
			
			t--;
		}
	}
}
// } Driver Code Ends


class GfG
{
    //Function to locate the occurrence of the string x in the string s.
    int strstr(String s, String x)
    {
       // Your code here
       int n=s.length(),m=x.length();
    //   String temp=s.substring(0,m);
       for(int i=0;i<n-m+1;i++)
       {
           int j=0,c=0;
           while(j<m)
           {
               if(s.charAt(i+j)==x.charAt(j))
               {
                   c++;
               }
               else
               {
                   break;
               }
                   j++;
           }
           if(c==x.length())
           {
               return i;
           }
       }
       return -1;
    }
}
