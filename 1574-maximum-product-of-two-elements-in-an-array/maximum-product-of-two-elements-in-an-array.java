class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int el : nums){
            pq.add(el);
        }
        return ((pq.remove())-1)* ((pq.remove())-1);
    }
}