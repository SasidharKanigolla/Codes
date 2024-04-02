class Solution {
    public boolean squareIsWhite(String s) {
        if((s.charAt(0)-'a')%2==0)
        {
            if((s.charAt(1)-'0')%2==0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            if((s.charAt(1)-'0')%2!=0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}