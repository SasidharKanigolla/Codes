class Solution {
    public String largestGoodInteger(String num) {
        int max=-1;
        for(int i=0;i<num.length()-2;i++)
        {
            String str=num.substring(i,i+3);
            if(str.equals("000"))
            {
                max=Math.max(0,max);
            }
            else if(Integer.valueOf(str)%111==0)
            {
                max=Math.max(Integer.valueOf(str)/111,max);
            }
        }
        if(max==-1) return "";
        String temp="";
        for(int i=0;i<3;i++)
        temp+=max+"";
        return temp;
    }
}