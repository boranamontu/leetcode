class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
     PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
    for(int i=stones.length-1;i>=0;i--){
       
        pq.add(stones[i]);
    }
    while(pq.size()!=1){
        int n1 = pq.remove();
        int n2 = pq.remove();
        pq.add(Math.abs(n2-n1));

    }
    return pq.remove();
    }
}