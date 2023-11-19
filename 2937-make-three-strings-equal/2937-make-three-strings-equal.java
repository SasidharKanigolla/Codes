class Solution {
    public int findMinimumOperations(String a, String b, String c) {
        int i=0,count=0;
        // if((a.charAt(0)!=b.charAt(0)&&b.charAt(0)!=c.charAt(0))||(a.length()<3||b.length()<3||c.length()<3))
        //     {
        //         return -1;
        //     }
        while(i<a.length()&&i<b.length()&&i<c.length())
        {
            if(a.charAt(i)==b.charAt(i)&&b.charAt(i)==c.charAt(i))
            {
                count++;
            }
            else
            {
                break;
            }
            i++;
        }
        if(count==0) return -1;
        int sum = (a.length()-count)+(b.length()-count)+(c.length()-count);
        return sum;
    }
}