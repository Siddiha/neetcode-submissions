class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;       // Buy day
        int right = 1;      // Sell day
        int maxProfit = 0;

        while (right < prices.length) {
            // Is it profitable?
            if (prices[right] > prices[left]) {
                int currentProfit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, currentProfit);
            } else {
                // Found a cheaper day to buy, slide the window!
                left = right;
            }
            // Always move the sell day forward
            right++;
        }

        return maxProfit;
    }
}