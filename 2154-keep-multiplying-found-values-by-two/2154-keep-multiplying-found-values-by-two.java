class Solution {
    public int findFinalValue(int[] nums, int orig) {
        int temp=1,i=0;
        Boolean a=true;
        while(a==true)
        {
            for(i=0;i<nums.length;i++)
            {
                if(nums[i]==orig)
                {
                    orig=orig*2;
                    break;
                }
            }
            if(i==nums.length)
            {
                a=false;
            }
        }
        return orig;
    }
}