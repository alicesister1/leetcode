class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            int number = nums[index];
            int key = target - number;
            if (map.containsKey(key)) {
                result[0] = map.get(key);
                result[1] = index;
                break;
            }
            map.put(number, index);
        }
        return result;
    }
}