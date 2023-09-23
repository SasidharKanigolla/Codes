class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        List<Integer> arr = new ArrayList<>();
        int temp,c=0;
        boolean a=false;
        for(int i=0;i<nums.length;i++)
        {
            a=false;
            temp=nums[i];
            c=0;
            while(i<nums.length&&nums[i]==temp)
            {
                c++;
                i++;
                a=true;
            }
            if(a==true)
            {
                i--;
            }
            if(c>nums.length/3)
            {
                arr.add(nums[i]);
            }
        }
        return arr;
    }
}