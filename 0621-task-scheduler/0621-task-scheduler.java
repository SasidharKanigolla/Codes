class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer> map = new HashMap<>();
        int max=0;
        for(char c:tasks)
        {
            map.put(c,map.getOrDefault(c,0)+1);
            max = Math.max(max,map.get(c));
        }
        int ans = (max-1)*(n+1);
        for(char c : map.keySet())
        {
            if(map.get(c)==max)
            {
                ans++;
            }
        }
        return Math.max(tasks.length,ans);
    }
}