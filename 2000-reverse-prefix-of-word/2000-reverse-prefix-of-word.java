class Solution {
    public String reversePrefix(String word, char ch) {
        String ans="";
        for(int i=0;i<word.length();i++)
        {
            ans = word.charAt(i) + ans;
            if(ch == word.charAt(i))
            {
                ans =ans + word.substring(i+1,word.length());
                return ans;
            }
        }
        return word;
    }
}