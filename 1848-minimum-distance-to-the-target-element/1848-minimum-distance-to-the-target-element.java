class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min=Integer.MAX_VALUE,c=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                min=Math.min(min,Math.abs(i-start));
                c=1;
            }
        }
        if(c==1)
        return min;
        return 0;
    }
}