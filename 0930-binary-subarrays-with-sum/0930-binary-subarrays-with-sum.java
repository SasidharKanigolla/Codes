class Solution {
    int atmost(int[] nums,int goal)
    {
        if(goal<0) return 0;
        int sum=0,i=0,j=0,res=0;
        for(i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            while(sum>goal)
            {
                sum-=nums[j];
                j++;
            }
            res+=(i-j+1);
        }
        return res;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atmost(nums,goal)-atmost(nums,goal-1);
    }
}