class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        Queue<Integer> q = new LinkedList<>();
        int min = Integer.MAX_VALUE;
        String str="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                q.add(i);
                if(q.size()==k)
                {
                    int start=q.peek();
                    int len = i-start+1;
                    String st = s.substring(start,i+1);
                    if(len<min||(len==min&&st.compareTo(str)<0))
                    {
                        min=len;
                        str=st;
                    }
                    q.poll();
                }
            }
        }
        return str;
    }
}