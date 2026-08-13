class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            // Calculate profit if we sell today
            int profit = prices[i] - minPrice;

            // Update maximum profit
            if (profit > maxProfit) {
                maxProfit = profit;
            }

            // Update minimum buying price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }

        return maxProfit;  
    }
}