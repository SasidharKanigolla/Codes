class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> arr =new ArrayList<>();
        // int ind;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[Math.abs(nums[i])-1]<0)
            {
                arr.add(Math.abs(nums[i]));
            }
            // nums[i]=-1*nums[i];
            nums[Math.abs(nums[i])-1]=-nums[Math.abs(nums[i])-1];
        }
        return arr;
    }
}