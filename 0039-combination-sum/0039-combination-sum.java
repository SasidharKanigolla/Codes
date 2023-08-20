class Solution {
    public void comb(int ind,int[] cand,List<List<Integer>> arr,int target,List<Integer> ds)
    {
        if(ind == cand.length)
        {
            if(target==0)
            {
                arr.add( new ArrayList<>(ds));
            }
            return ;
        }
        if(cand[ind]<=target)
        {
            ds.add(cand[ind]);
            comb(ind,cand,arr,target-cand[ind],ds);
            ds.remove(ds.size()-1);
        }
        comb(ind+1,cand,arr,target,ds);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> arr = new ArrayList<>();
        comb(0,candidates,arr,target,new ArrayList<Integer>());
        return arr;
    }
}