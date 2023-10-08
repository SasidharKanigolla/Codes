class Solution {
    public String decodeMessage(String s, String m) {
        HashMap<Character,Character> map =new HashMap<>(26);
        ArrayList<Character> arr = new ArrayList<>();
        int c=0;
        char tem='a';
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' '&&!map.containsKey(s.charAt(i)))
            {
                arr.add(s.charAt(i));
                map.put(s.charAt(i),tem++);
                // c++;
            }
        }
        String str="",temp="";
        for(int i=0;i<m.length();i++)
        {
            if(m.charAt(i)==' ')
            {
                str+=temp+" ";
                temp="";
            }
            else
            {
                temp+=map.get(m.charAt(i));
            }
        }
        str+=temp;
        return str;
        // return String.valueOf(arr);
    }
}