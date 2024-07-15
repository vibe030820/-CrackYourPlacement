class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int buyprice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
        if(buyprice<prices[i]){
            profit=prices[i]-buyprice;
            maxProfit=Math.max(maxProfit,profit);
        }
        else{
            buyprice=prices[i];
        }
        }
        return maxProfit;
    }
}