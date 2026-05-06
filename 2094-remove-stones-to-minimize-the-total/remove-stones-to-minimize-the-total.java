class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int sum = 0;
        for(int i = 0 ; i < piles.length ; i++){
            sum = sum + piles[i];
            pq.add(piles[i]);
        }
        while(k != 0){
            int top = pq.remove();
            sum = sum - top;
            if(top % 2 ==0){
                top = top / 2;
            }else{
                top = (top / 2) + 1;
            }
            sum = sum + top;
            pq.add(top);
            k--;
        }
        return sum;
    }
}