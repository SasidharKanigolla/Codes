class Solution {
    static void sub(List<List<Integer>> ans,int[] nums,ArrayList<Integer> temp,int ind)
    {
        ans.add(new ArrayList<>(temp));
        for(int i=ind;i<nums.length;i++)
        {
            if(i>ind&&nums[i]==nums[i-1]) 
            {
                continue;
            }
            temp.add(nums[i]);
            sub(ans,nums,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        sub(ans,nums,new ArrayList<>(),0);
        return ans;
    }
}