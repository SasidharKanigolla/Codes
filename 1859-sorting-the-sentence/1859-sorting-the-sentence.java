class Solution {
    public String sortSentence(String s) {
        HashMap<Integer,String> map = new HashMap<>();
        String temp="";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                int ind = s.charAt(i)-'0';
                map.put(ind,temp);
                temp="";
            }
            else
            {
                if(s.charAt(i)!=' ')
                {
                    temp+=s.charAt(i);
                }
            }
        }
        String ans="";
        for(int i:map.keySet())
        {
            ans+=map.get(i)+" ";
        }
        return ans.substring(0,ans.length()-1);
    }
}