import java.util.Map;
import java.util.HashMap;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // 2번 이상 나타나는 값이 존재하면 true, 아니면 false 반환
        Map<Integer, Integer> hash = new HashMap();
        for (int num : nums) {
            if (!hash.containsKey(num)) {
                hash.put(num, 1);
                continue;
            }
            
            hash.put(num, hash.get(num) + 1);
        }
    
        for (Integer value : hash.values()) {
            if (value > 1) {
                return true;
            }
        }
        return false;
    }
}