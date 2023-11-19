//{ Driver Code Starts
import java.util.*;
 
class RLEncoding
{
   public static void main(String[] args) 
   {
 
      Scanner sc = new Scanner(System.in);
    
	  int T = sc.nextInt();
	  sc.nextLine();
	  while(T>0)
	  {
		  
		String str = sc.nextLine();
		
		GfG g = new GfG();
		System.out.println(g.encode(str));
		
      
        T--;
	  }
   }
}


// } Driver Code Ends


class GfG
 {
	String encode(String s)
	{
          //Your code here
          StringBuilder sb = new StringBuilder();
          int c=1;
          char ch=s.charAt(0);
          for(int i=1;i<s.length();i++)
          {
              if(s.charAt(i)==ch)
              {
                  c++;
              }
              else
              {
                  sb.append(ch);
                  sb.append(c);
                  c=1;
                  ch=s.charAt(i);
              }
          }
          sb.append(ch);
            sb.append(c);
          return sb.toString();
	}
	
 }