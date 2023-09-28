class Solution {
    public int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                even.add(nums[i]);
            }
            else
            {
                odd.add(nums[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        int a=0,b=odd.size()-1;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                nums[i]=even.get(a);
                a++;
            }
            else
            {
                nums[i]=odd.get(b);
                b--;
            }
        }
        return nums;
    }
}