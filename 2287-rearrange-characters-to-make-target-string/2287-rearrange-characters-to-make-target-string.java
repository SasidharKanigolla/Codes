class Solution {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character,Integer> a = new HashMap<>();
        HashMap<Character,Integer> b = new HashMap<>();
        int min=101;
        for(int i=0;i<target.length();i++)
        {
            a.put(target.charAt(i),a.getOrDefault(target.charAt(i),0)+1);
        }
        for(int i=0;i<s.length();i++)
        {
            if(a.containsKey(s.charAt(i)))
            {
                b.put(s.charAt(i),b.getOrDefault(s.charAt(i),0)+1);
            }
        }
        for(char ch:a.keySet())
        {
            if(b.get(ch)==null||a.get(ch)>b.get(ch)) return 0;
            if(a.get(ch)<=b.get(ch))
            {
                min=Math.min(min,b.get(ch)/a.get(ch));
            }
        }
        return min;
    }
}