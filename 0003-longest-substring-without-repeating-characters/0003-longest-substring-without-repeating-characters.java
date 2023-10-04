class Solution {
    public int lengthOfLongestSubstring(String s) {
        // if(s.length()==0) return 0;
        // String str="";
        // int c=0,max=0;
        // for(int i=0;i<s.length();i++)
        // {
        //     char temp=s.charAt(i);
        //     if(str.contains(""+temp))
        //     {
        //         i=i-str.length()+str.indexOf(temp)+1;
        //         str=""+s.charAt(i);
        //         max=Math.max(c,max);
        //         c=1;
        //     }
        //     else
        //     {
        //         str+=s.charAt(i);
        //         c++;
        //     }
        // }
        // max=Math.max(c,max);
        // return max;
        HashSet<Character> uniqueChars = new HashSet<>();
    int start = 0;
    int end = 0;
    int maxSubstringLength = 0;

    while (end < s.length()) {
        if (!uniqueChars.contains(s.charAt(end))) {
            uniqueChars.add(s.charAt(end));
            maxSubstringLength = Math.max(maxSubstringLength, end - start + 1);
            end++;
        } else {
            uniqueChars.remove(s.charAt(start));
            start++;
        }
    }

    return maxSubstringLength;
    }
}