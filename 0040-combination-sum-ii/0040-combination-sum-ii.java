class Solution {
    static void find(int ind,int[] cand,int tar,List<List<Integer>> ans,List<Integer> ds)
    {
        if(tar==0)
        {
            ans.add(new ArrayList<>(ds));
            return ;
        }
        for(int i=ind;i<cand.length;i++)
        {
            if(i>ind&&cand[i]==cand[i-1]) continue;
            if(cand[i]>tar) break;
            ds.add(cand[i]);
            find(i+1,cand,tar-cand[i],ans,ds);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] cand, int tar) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(cand);
        find(0,cand,tar,ans,new ArrayList<>());
        return ans;
    }
}