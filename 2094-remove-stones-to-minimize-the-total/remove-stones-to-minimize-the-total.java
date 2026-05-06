class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int sum = 0;
        for(int el : piles){
            pq.add(el);
        }
        while(k != 0){
            pq.add(pq.peek()-(int)Math.floor(pq.remove() / 2));
            k--;
        }
        while(!pq.isEmpty()){
            sum = sum + pq.remove();
        }
        return sum;
    }
}