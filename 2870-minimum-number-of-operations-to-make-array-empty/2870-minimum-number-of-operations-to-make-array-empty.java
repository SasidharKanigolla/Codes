class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int c=0;
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map.keySet())
        {
            if(map.get(i)==1)
            {
                return -1;
            }
            c+=map.get(i)/3;
            if(map.get(i)%3!=0)
            {
                c++;
            }
        }
        return c;
    }
}