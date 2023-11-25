class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] result= new int[n];
        prefix[0]=nums[0];
        suffix[n-1]=nums[n-1];
        for(int i=1;i<n;i++)
        {
            prefix[i]=prefix[i-1]+nums[i];
            suffix[n-i-1]=suffix[n-i]+nums[n-i-1];
        }
        for(int i=0;i<n;i++)
        {
            int temp = ((nums[i]*i)-prefix[i])+(suffix[i]-(nums[i]*(n-i-1)));
            result[i]=temp;
        }
        return result;
    }
}