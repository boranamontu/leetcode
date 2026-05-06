class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int sum = 0;
        for(int i = 0 ; i < piles.length ; i++){
            pq.add(piles[i]);
        }
        while(k != 0){
            pq.add(pq.peek()-(int)Math.floor(pq.remove() / 2));
            // int top = pq.remove();

            // if(top % 2 == 0){
            //     top = top / 2;
            // }else{
            //     top = (top / 2) + 1;
            // }
            // pq.add(top);
            k--;
        }
        while(!pq.isEmpty()){
            sum = sum + pq.remove();
        }
        return sum;
    }
}