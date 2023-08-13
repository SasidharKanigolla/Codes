class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        if(s.length()==0&&t.length()>0)
        {
            return true;
        }
        if(s.length()>0&&t.length()==0)
        {
            return false;
        }
        while(j<s.length() && i<t.length())
        {
            if(s.charAt(j)==t.charAt(i))
            {
                j++;
            }
            i++;
        }
        if(j==s.length())
        {
            return true;
        }
            return false;
    }
}