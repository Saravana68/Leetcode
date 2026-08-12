class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        if(prices.length <=1) return maxProfit;

        int bestSellValue = prices[prices.length -1];
        for( int currentValue = prices.length-2; currentValue >=0; currentValue--){
            if(bestSellValue > prices[currentValue]){
                int currentProfit = bestSellValue - prices[currentValue];
                maxProfit = Math.max(maxProfit,currentProfit);
            }
            bestSellValue = Math.max(bestSellValue,prices[currentValue]);
        }
        return maxProfit;
    }
}