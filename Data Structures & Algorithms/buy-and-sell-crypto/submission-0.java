class Solution {
    public int maxProfit(int[] prices) {
        int buyIndex = 0;
        int sellIndex = 1;
        int maxProfit = 0;
        while(buyIndex<prices.length && sellIndex<prices.length){
            if(prices[sellIndex]>=prices[buyIndex]){
                maxProfit = Math.max(maxProfit,prices[sellIndex]-prices[buyIndex]);
                sellIndex++;
            }
            else if(prices[sellIndex]<prices[buyIndex]){
                buyIndex = sellIndex;
                sellIndex++;
            }
        }
        return maxProfit;
    }
}
