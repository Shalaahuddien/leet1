class Solution {
    public int maxProfit(int[] prices) {
        int N = prices.length;
        if(N < 2) return 0;
        int total = 0, min = prices[0];
        for(int i = 1; i < N; i++)
        {
            int profit = prices[i] - min;
            if(profit > 0)
            {
                total +=profit;
                min = prices[i];
            }
            min = Math.min(min, prices[i]);
        }
        return total;
    }
}