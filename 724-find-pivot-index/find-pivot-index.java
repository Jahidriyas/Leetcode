    class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        int left = 0;

        // Calculate total sum
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }

        // Find pivot index
        for (int i = 0; i < nums.length; i++) {
            if (left == total - left - nums[i]) {
                return i;
            }
            left += nums[i];
        }

        return -1;
    }
}