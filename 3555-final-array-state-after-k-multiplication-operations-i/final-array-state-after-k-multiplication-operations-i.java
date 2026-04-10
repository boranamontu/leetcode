class Solution {
    static public class sort implements Comparable<sort>{
        int val;
        int idx;
        sort(int idx,int val){
            this.idx = idx;
            this.val = val;
        }
        public int compareTo(sort curr){
            if(this.val == curr.val){
                return this.idx - curr.idx;
            }
            return this.val - curr.val;
        }
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<sort> pq = new PriorityQueue<>();
        for(int i = 0 ; i < nums.length ; i++){
            pq.add(new sort(i,nums[i]));
        }

        while(k != 0){
            nums[pq.peek().idx] = pq.peek().val * multiplier;
            int index = pq.peek().idx;
            int value = pq.peek().val * multiplier;
            pq.remove();
            pq.add(new sort(index,value));
            k--;
        }
        return nums;
    }
}