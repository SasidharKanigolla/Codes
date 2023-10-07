class Solution {
    public boolean canBeIncreasing(int[] nums) {
	for (int i = 1, dips = 0, previous = nums[0]; i < nums.length; i++)
		if (nums[i] <= previous) {
			if (++dips == 2)
				return false;
			if (i == 1 || nums[i] > nums[i - 2])
				previous = nums[i];
		} else {
			previous = nums[i];
		}
	return true;
}
}