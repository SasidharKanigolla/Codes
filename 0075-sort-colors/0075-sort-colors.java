class Solution {
    public void sortColors(int[] nums) {
        int p1=0,p2=nums.length-1,i=0;
        while(i<=p2)
        {
            if(nums[i]==0)
            {
                nums[i]=nums[p1];
                nums[p1]=0;
                p1++;
            }
            if(nums[i]==2)
            {
                nums[i]=nums[p2];
                nums[p2]=2;
                p2--;
                i--;
            }
        i++;
        }

    }
}