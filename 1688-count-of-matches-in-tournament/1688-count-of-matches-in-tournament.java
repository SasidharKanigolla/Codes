class Solution {
    public int numberOfMatches(int n) {
        int c=0;
        while(n!=1)
        {
            if(n%2==1)
            {
                c+=n/2;
                n=n/2+1;
            }
            else 
            {
                c+=n/2;
                n=n/2;
            }
        }
        return c;
    }
}