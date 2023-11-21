class Solution {
    long helper(int a,int b)
    {
        String s1 = ""+a;
        String s2 = ""+b;
        return Long.valueOf(s1+s2);
    }
    public long findTheArrayConcVal(int[] nums) {
        long ans=0;
        int i=0,j=nums.length-1;
        while(i<j)
        {
            ans+=helper(nums[i],nums[j]);
            i++;
            j--;
        }
        if(nums.length%2!=0)
        {
            ans+=helper(0,nums[i]);
        }
        return ans;
    }
}