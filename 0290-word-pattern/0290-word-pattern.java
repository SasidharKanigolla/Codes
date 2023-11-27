class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str= s.split(" ");
        if(str.length!=pattern.length())
        {
            return false;
        }
        HashMap<Character,String> map = new HashMap<>();
        for(int i=0;i<pattern.length();i++)
        {
            if(!map.containsKey(pattern.charAt(i)))
            {
                if(map.containsValue(str[i]))
                {
                    return false;
                }
                map.put(pattern.charAt(i),str[i]);
            }
            else
            {
                if(!map.get(pattern.charAt(i)).equals(str[i]))
                return false;
            }
        }
        return true;
    }
}