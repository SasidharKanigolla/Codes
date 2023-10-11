class Solution {
    public int countHomogenous(String s) {
        int mod=1000000007;
        int res=0,temp=0;
        char ch=' ';
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==ch)
            {
                temp++;
            }
            else
            {
                temp=1;
            }
            ch=s.charAt(i);
            res=(res+temp)%mod;
        }
        return res;
    }
}