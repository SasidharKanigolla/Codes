class Solution {
    public int maxScore(String s) {
        int c1=0,c0=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                c1++;
            }
        }
        int max=0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)=='0')
            {
                c0++;
            }
            if(s.charAt(i)=='1')
            {
                c1--;
            }
            max=Math.max(max,c1+c0);
        }
        return max;
    }
}