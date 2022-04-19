import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // 2번 이상 나타나는 값이 존재하면 true, 아니면 false 반환
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
}