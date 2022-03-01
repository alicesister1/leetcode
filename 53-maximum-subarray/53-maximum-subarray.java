class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int sum = 0;
        int maxSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (sum >= 0) {
                sum += nums[i];
            } else {
                sum = nums[i];
            }
            if (sum >= maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }
}