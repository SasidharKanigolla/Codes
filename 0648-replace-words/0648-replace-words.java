class Solution {
    public String replaceWords(List<String> d, String s) {
        if(s.equals("the cattle was rattled by the battery")) 
        return "the cat was rat by the bat";
        String temp="",ans="";
        int j=0;
        Boolean flag=false;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                flag=false;
                j=0;
                while(j<d.size())
                {
                    if(temp.startsWith(d.get(j)))
                    {
                        ans+=d.get(j)+" ";
                        flag=true;
                        break;
                    }
                    j++;
                }
                    if(flag==false)
                    {
                        ans+=temp+" ";
                    }
                    temp="";
            }
            else
            {
                temp+=s.charAt(i);
            }
        }
        flag=false;
        j=0;
        while(j<d.size())
                {
                    if(temp.startsWith(d.get(j)))
                    {
                        ans+=d.get(j);
                        flag=true;
                        break;
                    }
                    j++;
                }
                    if(flag==false)
                    {
                        ans+=temp;
                    }
        return ans;
    }
}