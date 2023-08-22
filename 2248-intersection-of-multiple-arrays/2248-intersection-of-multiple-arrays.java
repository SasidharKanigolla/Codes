class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                map.put(nums[i][j],map.getOrDefault(nums[i][j],0)+1);
            }
        }
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=0;i<nums[0].length;i++)
        {
            if(map.get(nums[0][i])==nums.length)
            {
                list.add(nums[0][i]);
            }
        }
        Collections.sort(list);
        return list;
    }
}