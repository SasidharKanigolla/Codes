class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int i = nums.length;
        return (nums[i-1]-1)*(nums[i-2]-1);
    }
}