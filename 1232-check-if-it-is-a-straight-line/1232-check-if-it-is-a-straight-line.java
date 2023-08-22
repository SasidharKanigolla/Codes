class Solution {
    public boolean checkStraightLine(int[][] nums) {
        int i;
        int x1=nums[0][0],y1=nums[0][1];
        int diffx=nums[1][0]-x1,diffy=nums[1][1]-y1;
        // c=nums[0][1]-nums[0][0];
        for(i=1;i<nums.length;i++)
        {
            int x=nums[i][0],y=nums[i][1];
            if(diffx*(y-y1)!=diffy*(x-x1))
            {
                return false;
            }
        }
        return true;
    }
}