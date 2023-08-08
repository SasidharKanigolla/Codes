class Solution {
    public boolean isValid(String x) {
        int i;
        Stack<Character> st = new Stack<>();
        int a = x.length();
        for(i=0;i<a;i++)
        {
            if(x.charAt(i)=='(' || x.charAt(i)=='{' || x.charAt(i)=='[')
            {
                st.push(x.charAt(i));
            }
            else
            {
                if(st.empty())
                {
                    return false;
                }
                else if(st.peek()=='('&&x.charAt(i)==')')
                {
                    st.pop();
                }
                else if(st.peek()=='{'&&x.charAt(i)=='}')
                {
                    st.pop();
                }
                else if(st.peek()=='['&&x.charAt(i)==']')
                {
                    st.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        if(st.empty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}