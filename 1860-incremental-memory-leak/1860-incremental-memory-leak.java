class Solution {
    public int[] memLeak(int a, int b) {
     int[] arr = new int[3];
     int i=1;
     while(a>=i||b>=i)
     {
         if(a>=b)
         {
             a=a-i;
         }
         else
         {
             b=b-i;
         }
         i++;
     }  
     arr[0]=i;
     arr[1]=a;
     arr[2]=b; 
     return arr;
    }
}