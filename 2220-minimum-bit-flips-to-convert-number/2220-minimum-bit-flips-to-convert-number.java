class Solution {
    String ToBinary(int n)
    {
        String str ="";
        for(int i=31;i>=0;i--)
        {
            int k = n >> i;
            if((k&1)>0) str+="1";
            else str+="0";
        }
        return str;
    }
    public int minBitFlips(int start, int goal) {
        String a = ToBinary(start);
        String b = ToBinary(goal);
        int c=0;
        for(int i = 31;i>=0;i--)
        {
            if(a.charAt(i)!=b.charAt(i))
            {
                c++;
            }
        }
        return c;
    }
}