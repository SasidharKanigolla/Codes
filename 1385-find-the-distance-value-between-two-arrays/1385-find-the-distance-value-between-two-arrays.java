class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
     int i,j,c=0;
     boolean bool=false;
     for(i=0;i<arr1.length;i++)
     {
         bool=false;
         for(j=0;j<arr2.length;j++)
         {
             if(Math.abs(arr1[i]-arr2[j])<=d)
             {
                 bool =true;
                 break;
             }
         }
         if(bool == false)
         {
             c++;
         }
     }
     return c;
    }
}