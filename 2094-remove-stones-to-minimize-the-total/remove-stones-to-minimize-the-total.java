class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int sum = 0;
        for(int i = 0 ; i < piles.length ; i++){
            pq.add(piles[i]);
        }
        while(k != 0){
            if(pq.peek() % 2 ==0){
                pq.add(pq.remove() / 2);
            }else{
                pq.add((pq.remove() / 2) + 1);
            }
            k--;
        }
        while(!pq.isEmpty()){
            sum = sum + pq.remove();
        }
        return sum;
    }
}