class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashMap<Character,Integer> map = new HashMap<>();
        int c=0;
        for(int i=0;i<allowed.length();i++)
        {
            map.put(allowed.charAt(i),map.getOrDefault(allowed.charAt(i),0)+1);
        }
        for(int i=0;i<words.length;i++)
        {
            int j;
            for(j=0;j<words[i].length();j++)
            {
                if(map.get(words[i].charAt(j))==null||map.get(words[i].charAt(j))==0)
                {
                    break;
                }
            }
            if(j==words[i].length())
            {
                c++;
            }
        }
        return c;
    }
}