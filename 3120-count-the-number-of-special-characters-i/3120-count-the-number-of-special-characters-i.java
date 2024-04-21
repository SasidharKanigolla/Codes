class Solution {
    public int numberOfSpecialChars(String word) {
        int[] small = new int[26];
        int[] cap = new int[26];
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)>='a'&&word.charAt(i)<='z')
            {
                if(small[word.charAt(i)-'a']==0)
                small[word.charAt(i)-'a']++;
            }
            else
            {
                cap[word.charAt(i)-'a'+32]++;
            }
        }
        int c=0;
        for(int i=0;i<26;i++)
        {
            if(small[i]>=1&&cap[i]>=1) c++;
        }
        return c;
    }
}