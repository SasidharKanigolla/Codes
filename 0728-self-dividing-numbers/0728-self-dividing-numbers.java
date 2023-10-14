class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            int temp=i,n=i;
            Boolean a=false;
            while(n!=0)
            {
                int b=n%10;
                if(b==0)
                {
                   a=true;
                    break; 
                }
                if(temp%b!=0)
                {
                    a=true;
                    break;
                }
                n/=10;
            }
            if(a==false)
            arr.add(i);
        }
        return arr;
    }
}