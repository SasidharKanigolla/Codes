class Solution {
public String sortVowels(String s) {
StringBuilder sb=new StringBuilder();
ArrayList pq = new ArrayList<>();
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            pq.add(ch);
        }
    }
    Collections.sort(pq);
    if(pq.isEmpty()){
        return s;
    }
    int j=0;
    
     for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            sb.append(pq.get(j));
            j++;
        }else{
             sb.append(ch);
        }
     }
    return sb.toString();
}
}