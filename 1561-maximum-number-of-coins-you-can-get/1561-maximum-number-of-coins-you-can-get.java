class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int i=0,j=piles.length-2;
        int c=0;
        while(i<=j)
        {
            c+=piles[j];
            i++;
            j-=2;
        }
        return c;
    }
}