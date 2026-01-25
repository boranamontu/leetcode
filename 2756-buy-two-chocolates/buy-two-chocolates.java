class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int i=0;
        if(prices[i]<money && (money-prices[i])>=prices[i+1]){
            money=money-(prices[i]+prices[i+1]);
            return money;
        }
        return money;
    }
}