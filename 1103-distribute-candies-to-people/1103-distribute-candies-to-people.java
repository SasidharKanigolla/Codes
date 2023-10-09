class Solution {
    public int[] distributeCandies(int candies, int n) {
        int[] arr = new int[n];
        Arrays.fill(arr,0);
        int temp=1;
        while(candies>0)
        {
            for(int i=0;i<n;i++)
            {
                if(candies<temp)
                {
                    arr[i]+=candies;
                    candies=0;
                    break;
                }
                arr[i]+=temp;
                candies-=temp;
                temp++;
            }
        }
        return arr;
    }
}