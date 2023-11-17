class Solution {
    public int minPairSum(int[] nums) {
        // Sort the array
        Arrays.sort(nums);

        int left = 0, right = nums.length - 1;
        int minMaxPairSum = Integer.MIN_VALUE;

        // Pair up elements and calculate pair sum
        while (left < right) {
            int pairSum = nums[left] + nums[right];
            minMaxPairSum = Math.max(minMaxPairSum, pairSum);

            left++;
            right--;
        }

        return minMaxPairSum;
    }
}