class Solution {
    public int maxProfit(int[] prices) {

        int buy = 1;
        int mini = prices[0];
        int profit = 0;

        while (buy < prices.length) {

            if (prices[buy] < mini) {
                mini = prices[buy];

            } else {
                profit = Math.max(profit, prices[buy] - mini);

            }
            buy++;
        }
        return profit;

    }
}