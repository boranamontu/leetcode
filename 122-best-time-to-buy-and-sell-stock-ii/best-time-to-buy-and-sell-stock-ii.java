class Solution {
    public int maxProfit(int[] prices) {
        int i=0;
        int ans=0;
        while(i<prices.length-1){
           
                if(prices[i]<prices[i+1]){
               ans=ans+(prices[i+1]-prices[i]);
               
                } i++;
            }
             return ans;
        }
       
    }
