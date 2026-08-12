class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        if(prices == null || prices.length <=1 ) return maxProfit;
        
        for(int current = 1; current < prices.length; current++){
            if(prices[current] > prices[current-1]){
                int currentProfit = prices[current] - prices[current-1];
                maxProfit += currentProfit;
            }
        }
        return maxProfit;
    }
}