class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max_ans = Integer.MIN_VALUE;
        for(int i = 1 ;i < prices.length;i++){
            if(prices[i]> min){
                max_ans = Math.max(max_ans,prices[i]-min);
            }else{
                min = prices[i];
            }
        }
        if(max_ans  < 0){
            return 0;
        }
        return max_ans;
    }
}