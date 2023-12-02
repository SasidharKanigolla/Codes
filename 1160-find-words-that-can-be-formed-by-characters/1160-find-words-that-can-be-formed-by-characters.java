class Solution {
    int check(String s,int[] arr)
    {
        int[] temp = new int[26];
        for(int i=0;i<s.length();i++)
        {
            temp[s.charAt(i)-'a']++;
            if(temp[s.charAt(i)-'a']>arr[s.charAt(i)-'a'])
            {
                return 0;
            }
        }
        return s.length();
    }
    public int countCharacters(String[] words, String chars) {
        int[] arr = new int[26];
        for(int i=0;i<chars.length();i++)
        {
            arr[chars.charAt(i)-'a']++;
        }
        int count=0;
        for(int i=0;i<words.length;i++)
        {
            count+=check(words[i],arr);
        }
        return count;
    }
}