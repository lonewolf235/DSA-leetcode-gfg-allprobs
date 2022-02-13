class Solution {
    public int maxProfit(int[] prices) {
        int max=0,min=0,maxdif=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<prices[i-1]){
               if(prices[i]<prices[min])
               { maxdif=Math.max((prices[max]-prices[min]),maxdif);
                   min=i;
                   max=i;}
            }
            else if(prices[i]>prices[i-1]){
                if(prices[i]>prices[max])
                    max=i;
            }
        }
        maxdif=Math.max((prices[max]-prices[min]),maxdif);
        return maxdif;
    }
}