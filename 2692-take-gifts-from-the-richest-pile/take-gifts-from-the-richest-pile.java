class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i = 0 ; i < gifts.length ; i++){
            pq.add(gifts[i]);
        }
        while(k != 0){
            pq.add((int)Math.sqrt(pq.remove()));
            k--;
        }
         
         long ans = 0;
         while(!pq.isEmpty()){
            ans = ans + pq.remove();
         }
         return ans;
    }
}