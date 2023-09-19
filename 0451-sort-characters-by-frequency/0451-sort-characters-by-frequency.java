class Solution {
    public String frequencySort(String s) {
     HashMap<Character,Integer> map = new HashMap<>();
     for(int i=0;i<s.length();i++)   
     {
         map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
     }
     List<Character> chars= new ArrayList(map.keySet()) ;
     Collections.sort(chars,(a,b)->(map.get(b)-map.get(a)));
     StringBuilder sb = new StringBuilder();
     for(Object c:chars)
     {
         for(int i=0;i<map.get(c);i++)
         {
             sb.append(c);
         }
     }
     return sb.toString();
    }
}