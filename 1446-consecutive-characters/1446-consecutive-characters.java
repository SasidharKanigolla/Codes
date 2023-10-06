class Solution {
    public int maxPower(String s) {
        int max=1,c=1;
        for(int i=1;i<s.length();i++)
        {
            while(i<s.length()&&s.charAt(i)==s.charAt(i-1))
            {
                c++;
                i++;
            }
            max=Math.max(c,max);
            c=1;
        }
        return max;
    }
}