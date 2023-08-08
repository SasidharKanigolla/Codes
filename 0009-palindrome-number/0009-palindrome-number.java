class Solution {
    public boolean isPalindrome(int x) {
        int rem,rev=0;
        int temp=x;
        if(x<0)
        return false;
        while(x!=0)
        {
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        if(rev==temp)
        return true;
        else
        return false;
    }
}