class Solution {
    public int numberOfSubstrings(String s) {
        int[] arr={0,0,0};
        int c=0,j=0,ans=0,n=s.length(),i;
         for(i=0;i<n;i++)   
         {
             arr[s.charAt(i)-'a']++;
             if(arr[s.charAt(i)-'a']==1)
             {
                 c++;
             }
            while(j<n && c>2)
            {
                ans+=(n-i);
                arr[s.charAt(j)-'a']--;
                if(arr[s.charAt(j)-'a']==0)
                {
                    c--;
                }
                j++;
            }
         }
         return ans;
    }
}