class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            while(i<s.length()&& !st.isEmpty() && Math.abs( (st.peek()) - (s.charAt(i)) )==32)
            {
                st.pop();
                i++;
            }
            if(i<s.length())
            st.push(s.charAt(i));
        }
        while(!st.isEmpty())
        {
            ans=st.peek()+ans;
            st.pop();
        }
        return ans;
    }
}