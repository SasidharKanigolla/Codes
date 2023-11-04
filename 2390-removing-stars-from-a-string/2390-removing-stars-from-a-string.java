class Solution {
    public String removeStars(String s) {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='*')
            {
                str.deleteCharAt(str.length()-1);
            }
            else
            {
                str.append(s.charAt(i));
            }
        }
        return String.valueOf(str);
    }
}