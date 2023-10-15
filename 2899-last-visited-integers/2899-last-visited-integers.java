class Solution {
    public List<Integer> lastVisitedIntegers(List<String> words) {
        List<Integer> ans = new ArrayList<>();
        List<String> num = new ArrayList<>();
        int k=0;
        for(int i=0;i<words.size();i++)
        {
            if(words.get(i).equals("prev"))
            {
                k++;
                if(num.size()-k>=0)
                {
                    ans.add(Integer.valueOf(num.get(num.size()-k)));
                }
                else
                {
                    ans.add(-1);
                }
            }
            else
            {
                num.add(words.get(i));
                k=0;
            }
        }
        return ans;
    }
}