class Solution {
    public int removeDuplicates(int[] nums) {
        int result = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                // 중복한 횟수
                result++;
            } else {
                // 중복이 아니라면 중복 아닌 인덱스에 보관
                nums[i - result] = nums[i];
            }
        }
        // 전체 중 중복한 횟수를 제한 나머지는 중복이 아닌것만 보관
        return nums.length - result;
    }
}