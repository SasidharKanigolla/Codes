class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> ans = new ArrayList<>();
        int i=0,n=intervals.length;
        while(i<n)
        {
            if(intervals[i][0]<newInterval[0])
            {
                ans.add(intervals[i]);
                i++;
            }
            else
            {
                break;
            }
        }
        if(ans.size()==0 || (newInterval[0]>ans.get(ans.size()-1)[1]))
        {
            ans.add(newInterval);
        }
        else
        {
            int[] lastInterval = ans.get(ans.size()-1);
            lastInterval[1]=Math.max(lastInterval[1],newInterval[1]);
        }
        while(i<intervals.length)
        {
            int[] lastInterval = ans.get(ans.size()-1);
            if(lastInterval[1]>=intervals[i][0])
            {
                 lastInterval[1] = Math.max(lastInterval[1], intervals[i][1]);
            }
            else
            {
                ans.add(intervals[i]);
            }
            i++;
        }
        return ans.toArray(new int[ans.size()][]);
    }
}