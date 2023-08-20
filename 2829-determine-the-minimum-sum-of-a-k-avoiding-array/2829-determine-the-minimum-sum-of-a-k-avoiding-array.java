class Solution {
    public int minimumSum(int n, int k) {
     HashMap<Integer,Integer> map = new HashMap<>();
        int i=1,sum=0;
        
        while(n!=0)
        {
            if(map.containsKey(k-i)==false)
            {
                map.put(i,1);
                sum+=i;
                i++;
                n--;
            }
            else
            {
               i++; 
            }
        }
        return sum;
    }
}