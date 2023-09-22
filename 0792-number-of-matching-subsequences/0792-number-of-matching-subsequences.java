class Solution {
    public int numMatchingSubseq(String s, String[] words) {
     HashMap<String,Integer> map = new HashMap<>();
     int c=0;
    for(int i =0;i<words.length;i++)
    {
      map.put(words[i],map.getOrDefault(words[i],0)+1);
    }
    char[] temp = s.toCharArray();
    for(String str:map.keySet())
    {
      char[] ch = str.toCharArray();
      int i=0,j=0;
      while(i<temp.length&&j<ch.length)
      {
        if(ch[j]==temp[i])
        {
          i++;
          j++;
        }
        else
        {
          i++;
        }
      }
      if(j==ch.length)
      {
        c+=map.get(str);
      }
    }
    return c;
    }
}