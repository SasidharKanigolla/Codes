class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                max=Math.max(c,max);
                c=0;
            }
            else
            {
                c++;
            }
        }
        max=Math.max(c,max);
        return max;
    }
}