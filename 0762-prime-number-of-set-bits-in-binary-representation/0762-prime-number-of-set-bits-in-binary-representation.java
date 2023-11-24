class Solution {
    public int countPrimeSetBits(int left, int right) {
    HashSet<Integer> set= new HashSet<>();
    int c=0;
    Collections.addAll(set,2, 3, 5, 7, 11, 13, 17,19);
    for(int i=left;i<=right;i++)
    {
        if(set.contains(Integer.bitCount(i)))
        {
            c++;
        }
    }
        return c;
    }
}