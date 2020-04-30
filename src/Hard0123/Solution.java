class Solution {
    
    public int maxProfit(int[] prices) {
        // 计算 0 到 i 天交易一次的最大收益与 i 到 length 天交易一次的最大收益和
        int max = 0;
        for (int i = 0; i < prices.length;i++){
            max = Math.max(max, func(prices, 0, i) + func(prices, i, prices.length));
        }
        return max;
    }

    private int func(int[] prices, int start, int end){
        int min = prices[start];
        int profit = 0;
        for (int i = start; i < end; i++){
            profit = Math.max(prices[i] - min,profit);
            min = Math.min(min,prices[i]);
        }
        return profit;
    }
}
