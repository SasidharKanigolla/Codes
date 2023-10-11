class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int c=0;
        for(int i=0;i<costs.length;i++)
        {
            if(coins<0)
            return c;
            coins-=costs[i];
            if(coins>=0)
            c++;
        }
        return c;
    }
}