class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i = 0; i <= n; i++) {
            String str = toBinary(i);
            ans[i] = countingNumberOf1(str);
        }
        return ans;
    }
    
    private String toBinary(int n) {
        String result = Integer.toBinaryString(n);
        System.out.println(result);
        return result;
    }
    
    private int countingNumberOf1(String binary) {
        int count = 0;
        for (Character ch : binary.toCharArray()) {
            if (ch == '1') {
                count++;
            }
        }
        return count;
    }
}