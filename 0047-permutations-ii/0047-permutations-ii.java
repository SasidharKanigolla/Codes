class Solution {
    static void perm(List<List<Integer>> ans,int[] nums,List<Integer> temp,int[] arr)
    {
        if(temp.size()==nums.length)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(arr[i]==0)
            {
                if(i>0&&nums[i]==nums[i-1]&&arr[i-1]!=0)
                {
                    continue;
                }
                temp.add(nums[i]);
                arr[i]=1;
                perm(ans,nums,temp,arr);
                temp.remove(temp.size()-1);
                arr[i]=0;
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int[] arr = new int[nums.length];
        perm(ans,nums,temp,arr);
        return ans;
    }
}