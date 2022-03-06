class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int profit = 0;
        int tempProfit;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            }
            tempProfit = prices[i] - buyPrice;
            if (profit < tempProfit) {
                profit = tempProfit;
            }
        }
        return profit;
      }
}