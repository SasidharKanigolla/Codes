class Solution {
    public int reverse(int x) {
        
        long  n = Math.abs(x);
        long rem,rev=0;
        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev>=Math.pow(2,31)||rev<=Math.pow(2,-31))
        {
            return 0;
        }
        if(x<0)
        {
            return (int)(-1*rev);
        }
        else
        {
            return (int)rev;
        }
    }
}