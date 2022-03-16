import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Solution {
    public int majorityElement(int[] nums) {
        int criteria = (int) (nums.length * 0.5 + 0.5);
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.putIfAbsent(n, 0);
            map.computeIfPresent(n, (integer, integer2) -> integer2 + 1);
        }

        for (Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() >= criteria) {
                return e.getKey();
            }
        }

        return 0;
    }
}