class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxProfit, cheapest = 0, max(prices)
        for price in prices:
            maxProfit = max(maxProfit, price - cheapest)
            cheapest = min(cheapest, price)
        return maxProfit