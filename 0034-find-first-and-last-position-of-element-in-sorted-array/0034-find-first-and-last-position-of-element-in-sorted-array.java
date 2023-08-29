class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        if(nums.length==0)
        {
            arr[0]=-1;
            arr[1]=-1;
            return arr;
        }
        int a = first(nums,target);
        int b = last(nums,target);
        arr[0]=a;
        arr[1]=b;
        return arr;
    }
    static int first(int[] nums,int target)
    {
        int idx=-1,i=0,j=nums.length-1,mid;
        while(i<=j)
        {
            mid=(i+j)/2;
            if(nums[mid]==target)
            {
                idx=mid;
                j=mid-1;
            }
            else if(nums[mid]>target)
            {
                j=mid-1;
            }
            else
            {
                i=mid+1;
            }
        }
        return idx;
    }
    static int last(int[] nums,int target)
    {
        int idx=-1,i=0,j=nums.length-1,mid;
        while(i<=j)
        {
            mid=(i+j)/2;
            if(nums[mid]==target)
            {
                idx=mid;
                i=mid+1;
            }
            else if(nums[mid]>target)
            {
                j=mid-1;
            }
            else
            {
                i=mid+1;
            }
        }
        return idx;
    }
}