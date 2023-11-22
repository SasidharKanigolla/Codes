class Solution {
    public int titleToNumber(String s) {
        int ans=0;
        for(char c: s.toCharArray())
        {
            int temp=c-'A'+1;
            ans = ans*26+temp;
        }
        return ans;
    }
}