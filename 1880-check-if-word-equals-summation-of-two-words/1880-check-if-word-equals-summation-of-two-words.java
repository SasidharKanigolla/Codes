class Solution {
    public boolean isSumEqual(String fir, String sec, String tar) {
        int i=0,ans1=0,ans2=0,ans=0;
        while(i<fir.length())
        {
            ans1=ans1*10+(fir.charAt(i)-'a');
            i++;
        }
        i=0;
        while(i<sec.length())
        {
            ans2=ans2*10+(sec.charAt(i)-'a');
            i++;
        }
        i=0;
        while(i<tar.length())
        {
            ans=ans*10+(tar.charAt(i)-'a');
            i++;
        }
        return ans==ans1+ans2;
    }
}