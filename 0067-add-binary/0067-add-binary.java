class Solution {
    public String addBinary(String a, String b) {
        StringBuilder str = new StringBuilder();
        int carry=0,sum=0;
        int i=a.length()-1,j=b.length()-1;
        while(i>=0||j>=0)
        {
            sum=carry;
            if(i>=0)
            {
                sum+=a.charAt(i)-'0';
                i--;
            }
            if(j>=0)
            {
                sum+=b.charAt(j)-'0';
                j--;
            }
            if(sum>1)
            {
                carry=1;
            }
            else carry=0;
            str.append(sum%2);
        }
        if(carry != 0) str.append(carry);
        return str.reverse().toString();
    }
}