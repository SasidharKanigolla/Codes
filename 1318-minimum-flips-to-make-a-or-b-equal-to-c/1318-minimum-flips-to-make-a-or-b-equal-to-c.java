class Solution {
    String xor(int n)
    {
        String str="";
        for(int i=31;i>=0;i--)
        {
            int k = n >> i;
            if((k&1)>0) str+="1";
            else str+="0";
        }
        return str;
    }
    public int minFlips(int a, int b, int c) {
        String a1 = xor(a);
        String b1 = xor(b);
        String c1 = xor(c);
        int count=0;
        for(int i=31;i>=0;i--)
        {
            if(c1.charAt(i)=='0'&&(a1.charAt(i)=='1'||b1.charAt(i)=='1'))
            {
                if(a1.charAt(i)=='1')
                {
                    count++;
                }
                if(b1.charAt(i)=='1')
                {
                    count++;
                }

            }
            else if(c1.charAt(i)=='1'&&(a1.charAt(i)=='0'&&b1.charAt(i)=='0'))
            {
                count++;
            }
        }
        return count;
    }
}