class Solution {
    public int numDifferentIntegers(String s) {
        Set<String> set = new HashSet<>();
        int start=0;
        while(start<s.length())
        {
            if(Character.isDigit(s.charAt(start)))
            {
                int end=start;
                while(end<s.length()&&Character.isDigit(s.charAt(end)))
                {
                    end++;
                }
                while(start<end&&s.charAt(start)=='0')
                {
                    start++;
                }
                set.add(s.substring(start,end));
                start=end;
            }
            else
            start++;
        }
        return set.size();
    }
}