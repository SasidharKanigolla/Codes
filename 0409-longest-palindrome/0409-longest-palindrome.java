class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==0) return 0;
        HashSet<Character> set = new HashSet<>();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(set.contains(s.charAt(i)))
            {
                set.remove(s.charAt(i));
                c++;
            }
            else
            {
                set.add(s.charAt(i));
            }
        }
        if(!set.isEmpty()) return c*2+1;
        return c*2;
    }
}