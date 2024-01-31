class Solution {
    public int atmost(int[] nums,int k)
    {
        int c=0,temp=0,ans=0,j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2!=0)
            {
                temp++;
            }
            while(j<=i&&temp>k)
            {
                if(nums[j]%2!=0)
                {
                    temp--;
                }
                j++;
            }
            ans+=i-j+1;
        }
        return ans;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
    }
}