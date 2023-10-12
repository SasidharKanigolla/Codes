class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(i==index[i])
            {
                arr.add(nums[i]);
            }
            else
            {
                arr.add(index[i],nums[i]);
            }
        }
        int[] ar = new int[arr.size()];
        for(int i=0;i<arr.size();i++)
        {
            ar[i]=arr.get(i);
        }
        return ar;
    }
}