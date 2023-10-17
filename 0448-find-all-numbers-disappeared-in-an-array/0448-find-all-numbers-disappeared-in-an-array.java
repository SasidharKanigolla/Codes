class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] arr = new int[nums.length+1];
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            arr[nums[i]]++;
        }
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                a.add(i);
            }
        }
        return a;
    }
}