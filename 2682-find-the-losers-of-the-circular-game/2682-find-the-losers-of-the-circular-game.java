class Solution {
    int mod=(int)1e9;
    public int[] circularGameLosers(int n, int k) {
        int[] arr = new int[n];
        Arrays.fill(arr,0);
        int temp=0,c=0,ind=0;
        while(arr[ind]<=1)
        {
            ind+= ((c*k)%mod)%n;
            ind=(ind%mod)%n;
            arr[ind]++;
            c++;
        }
        int size = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                size++;
            }
        }
        int[] ans = new int[size];
        c=0;
        for(int i=0;i<n;i++)
        {  
            if(arr[i]==0)
            {
                ans[c++]=i+1;
            }
        }
        return ans;
    }
}