class Solution {
    public int maxProfit(int[] prices) {
        int cheapest = Integer.MAX_VALUE, maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            maxProfit = Math.max(maxProfit, prices[i] - cheapest);
            cheapest = Math.min(cheapest, prices[i]);
        }
        return maxProfit;
    }
}