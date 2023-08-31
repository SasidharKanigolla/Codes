class Solution {
    static void comb(List<List<Integer>> ans,int k,int n,ArrayList<Integer> temp,int ind)
    {
        if(temp.size()==k&&n==0)
        {
            ans.add(new ArrayList<>(temp));
            return ;
        }
        // if(temp.size()>k||n<0)
        // {
        //     return;
        // }
        for(int i=ind;i<10;i++)
        {
            temp.add(i);
            comb(ans,k,n-i,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        comb(ans,k,n,new ArrayList<>(),1);
        return ans;
    }
}