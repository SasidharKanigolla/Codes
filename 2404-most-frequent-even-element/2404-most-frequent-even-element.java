class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        if(map.size()==0)
        {
            return -1;
        }
        int max=0;
        for(int i : map.keySet())
        {
            max=Math.max(max,map.get(i));
        }
        int min=100001;
        for(int i:map.keySet())
        {
            if(map.get(i)==max)
            {
                min=Math.min(i,min);
            }
        }
        return min;
    }
}