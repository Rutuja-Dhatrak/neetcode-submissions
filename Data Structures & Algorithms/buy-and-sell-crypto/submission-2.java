class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = 0;
        int sell = 1;
       
        while(sell < prices.length){
            if(prices[buy] < prices[sell]){
                int diff = prices[sell] - prices[buy];
                profit = Math.max(profit, diff);
            }else{
                buy = sell;
            }
            sell++;
        }
        return profit;
    }
}
