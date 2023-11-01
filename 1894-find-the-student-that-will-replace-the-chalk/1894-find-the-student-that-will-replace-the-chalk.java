class Solution {
    public int chalkReplacer(int[] arr, int k) {
        // int i,c=0;
        // while(true)
        // {
        //     for(i=0;i<arr.length;i++)
        //     {
        //         if(k-arr[i]<0)
        //         {
        //             c=1;
        //             break;
        //         }
        //         k-=arr[i];
        //     }
        //     if(c==1)
        //         {
        //             break;
        //         }
        // }
        // return i;
        long sum=0l;
        for(int i:arr)
        {
            sum+=i;
        }
        sum=(int)(k%sum);
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            if(sum<arr[i])
            {
                ans=i;
                break;
            }
            sum-=arr[i];
        }
        return ans;
    }
}