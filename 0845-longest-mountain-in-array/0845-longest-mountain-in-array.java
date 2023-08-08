class Solution {
    public int longestMountain(int[] arr) {
        int i=0,c=0,max=0,a=0;
        for(i=0;i<arr.length-2;i++)
        {
            if(arr[i]<arr[i+1])
            {
                a=0;
                c=0;
                while(arr[i]<arr[i+1]&&i<arr.length-2)
                {
                    c++;
                    i++;
                }
                if(arr[i]>arr[i+1])
                {
                    while(arr[i]>arr[i+1]&&i<arr.length-2)
                    {
                        c++;
                        i++;
                    }
                    max=Math.max(c+1,max);
                    i--;
                    a=1;
                }
            }
        }
        if(arr.length>2&&c!=0&&a==1&&arr[arr.length-1]<arr[arr.length-2])
        {
            c++;
            max=Math.max(c+1,max);
        }
        
        return max;
    }
}