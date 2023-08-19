class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3)
        {
            return false;
        }
        int i=0,c=0;
        while(i<arr.length-1&&arr[i]<arr[i+1])
        {
            c=1;
            i++;
        }
        while(c==1&&(i<arr.length-1&&arr[i]>arr[i+1]))
        {
            i++;
        }
        if(arr[arr.length-1]<arr[arr.length-2])
        {
            i++;
        }
        if(i==arr.length)
        {
            return true;
        }
        return false;
    }
}