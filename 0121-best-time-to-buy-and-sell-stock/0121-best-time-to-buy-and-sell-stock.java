class Solution {
    public int maxProfit(int[] prices) {
        
        int maxProfit = Integer.MIN_VALUE;
        int minProfit = Integer.MAX_VALUE;
        
        for(int i =0; i < prices.length; i++){
            
            minProfit = Math.min(minProfit, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minProfit);
        }
        
        return maxProfit;
        
    }
}