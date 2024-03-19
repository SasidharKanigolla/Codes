class Solution {
    public int arrayNesting(int[] nums) {
        int i=0,j=0,max=0,n=nums.length;
        while(i<n)
        {
            int c=0;
            j=i;
            while(nums[j]>=0)
            {
                int temp = nums[j];
                nums[j]=-1;
                j=temp;
                c++;
            }
            max=Math.max(max,c);
            i++;
        }
        return max;
    }
}