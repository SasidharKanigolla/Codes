class Solution {
    public boolean checkRecord(String s) {
        int a=0,l=0;
        for(int i=0;i<s.length();i++)
        {
            if(l>0&&s.charAt(i)!='L')
            {
                l=0;
            }
            if(s.charAt(i)=='A')
            {
                a++;
                if(a>=2)
                {
                    return false;
                }
            }
            else if(s.charAt(i)=='L')
            {
                l++;
            }
            if(l>=3)
            {
                return false;
            }
        }
        return true;
    }
}