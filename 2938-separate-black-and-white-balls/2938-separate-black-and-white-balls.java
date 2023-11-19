class Solution {
    public long minimumSteps(String s) {
        // int c=0;
        long ans=0,c=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='0')
            {
                c++;
            }
            else
            {
                ans+=c;
                // c=0;
            }
        }
        return ans;
    }
}