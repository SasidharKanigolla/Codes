class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr= new int[2];
        int[] st= new int[nums.length+1];
        for(int i=0;i<nums.length;i++)
        {
            st[nums[i]]++;
        }
        for(int i=1;i<st.length;i++)
        {
            if(st[i]>1)
            {
                arr[0]=i;
            }
            if(st[i]==0)
            {
                arr[1]=i;
            }
        }
        return arr;
    }
}