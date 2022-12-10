class Solution {
    public int maxProfit(int[] prices) {
        int maxProfitVal = 0;
        int N = prices.length;
        if(N < 2) return maxProfitVal;
        int preMax = prices[N-1];
        for(int i = N - 2; i >= 0; i--)
        {
            preMax = Math.max(preMax, prices[i]);
            maxProfitVal = Math.max(maxProfitVal, preMax - prices[i]);
        }
        return maxProfitVal;
    }
}