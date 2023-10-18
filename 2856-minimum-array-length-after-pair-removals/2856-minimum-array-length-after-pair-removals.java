class Solution {
    public int minLengthAfterRemovals(List<Integer> nums) {
        int n = nums.size();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(nums.get(i),map.getOrDefault(nums.get(i),0)+1);
        }
        int max=0;
        for(int i:map.keySet())
        {
            max=Math.max(max,map.get(i));
        }   
        if(max<=n/2)
        {
            if(n%2==0)
            return 0;
            else
            return 1;
        }
        return max*2-n;
    }
}