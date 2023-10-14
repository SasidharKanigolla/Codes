class Solution {
    public String capitalizeTitle(String title) {
        int n=title.length(),c=0;
        String temp="",ans="";
        title=title.toLowerCase();
        for(int i=0;i<n;i++)
        {
            if(title.charAt(i)==' ')
            {
                if(c<3)
                {
                    ans+=temp.toLowerCase()+" ";
                    temp="";
                    c=0;
                }
                else
                {
                    ans+=temp.substring(0,1).toUpperCase()+temp.substring(1,temp.length())+" ";
                    temp="";
                    c=0;
                }
            }
            else
            {
                temp+=title.charAt(i);
                c++;
            }
        }
                if(c<3)
                {
                    ans+=temp.toLowerCase();
                    temp="";
                    c=0;
                }
                else
                {
                    ans+=temp.substring(0,1).toUpperCase()+temp.substring(1,temp.length());
                    temp="";
                    c=0;
                }
        return ans;
    }
}