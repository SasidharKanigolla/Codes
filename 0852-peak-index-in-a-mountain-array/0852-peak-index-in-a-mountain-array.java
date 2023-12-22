class Solution {
    public int peakIndexInMountainArray(int[] arr) {
       int l=0,r=arr.length-1,mid=0;
       while(l<=r)
       {
            mid=(l+r)/2;
           if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1])
           {
               return mid;
           }
           else if(arr[mid-1]<arr[mid]&&arr[mid]<arr[mid+1])
           {
               l=mid+1;
           }
           else
           {
               r=mid;
           }
       } 
       return mid;
    }
}