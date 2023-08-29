class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
    List<Integer> list = new ArrayList<>();
    HashMap<Integer,Integer> map = new HashMap<>();
    Boolean a=false;
    int c=0;
    for(int i:nums)
    {
        if(i==target)
        {
            a=true;
        }
        if(i<target)
        {
            c++;
        }
        map.put(i,map.getOrDefault(i,0)+1);
    }
        if(a==false)
        {
            return list;
        }
        int count=map.get(target);
        while(count>0)
        {
            list.add(c);
            c++;
            count--;
        }
        return list;
    }
}