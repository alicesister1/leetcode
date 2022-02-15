class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
          result ^= num;

          System.out.println("num = " + num);
          System.out.println("result = " + result);
        }

        return result;
    }
}