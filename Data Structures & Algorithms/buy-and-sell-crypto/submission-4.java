class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int l = 0, r = 1, n = prices.length;

        while(r < n) {
            if(prices[l] < prices[r]) {
                maxProfit = Math.max(maxProfit, prices[r] - prices[l]);
            } else l = r;

            r++;
        }

        return maxProfit;
    }
}
