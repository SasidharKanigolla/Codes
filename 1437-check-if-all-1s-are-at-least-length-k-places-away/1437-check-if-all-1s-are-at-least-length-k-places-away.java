class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int c=k;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1&&c>=k)
            {
                c=0;
            }
            else if(nums[i]==1)
            {
                return false;
            }
            else
            {
                c++;
            }
        }
        return true;
    }
}