class Solution {
    public String reverseWords(String s) {
        String ans="",temp="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                ans+=temp+" ";
                temp="";
            }
            else
            {
                temp=s.charAt(i)+temp;
            }
        }
        ans+=temp;
        return ans;
    }
}